/**
 * 
 */

// 时间处理
function myformatter(value, data, index) {

	var dd = new Date(data.oppTime);
	return dd.getFullYear() + "年" + (dd.getMonth()+1) + "月" + dd.getDate() + "日";

}
function newSale() {
	$('#dlg1').dialog('open').dialog('setTitle', '新营销机会');
	$('#fm1').form('clear');
	url = '/sale/add';
}
// 保存
function saveSale() {
	$('#fm1').form('submit', {
		url : url,
		onSubmit : function() {
			return $(this).form('validate');
		},
		success : function(result) {
			var result = eval('(' + result + ')');
			if (result.errorMsg) {
				$.messager.show({
					title : 'Error',
					msg : result.errorMsg
				});
			} else {
				$('#dlg1').dialog('close'); // close the dialog
				$('#dg1').datagrid('reload'); // reload the u ser data
			}
		}
	});
}
// 修改
function editSale() {
	var row = $('#dg1').datagrid('getSelected');
	if (row) {
		$('#dlg1').dialog('open').dialog('setTitle', 'Edit User');
		$('#fm1').form('load', row);
		url = '/sale/update';
	} else {
		alert("请选中一条数据");
	}
}
// 删除
function destroySale() {
	var row = $('#dg1').datagrid('getSelected');
	if (row) {
		$.messager.confirm('Confirm', '确认删除?', function(r) {
			if (r) {
				$.post('/sale/delete', {
					oppId : row.oppId
				}, function(result) {
					if (result.success) {
						$('#dg1').datagrid('reload'); // reload the user data
					} else {
						$.messager.show({ // show error message
							title : 'Error',
							msg : result.errorMsg
						});
					}
				}, 'json');
			}
		});
	} else {
		alert("请选中一条数据");
	}
}
// 模糊查询
function doSearch1() {
	$('#dg1').datagrid('load', {
		oppId : $('#soppId').val(),
		oppLinkman : $('#sopplinkman').val()
	});
}