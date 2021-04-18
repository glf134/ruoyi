-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数字签名设备', '2000', '1', '/datasync/signature', 'C', '0', 'datasync:signature:view', '#', 'admin', sysdate(), '', null, '数字签名设备菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数字签名设备查询', @parentId, '1',  '#',  'F', '0', 'datasync:signature:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数字签名设备新增', @parentId, '2',  '#',  'F', '0', 'datasync:signature:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数字签名设备修改', @parentId, '3',  '#',  'F', '0', 'datasync:signature:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数字签名设备删除', @parentId, '4',  '#',  'F', '0', 'datasync:signature:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数字签名设备导出', @parentId, '5',  '#',  'F', '0', 'datasync:signature:export',       '#', 'admin', sysdate(), '', null, '');
