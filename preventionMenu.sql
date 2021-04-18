-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络数据防泄漏系统', '2000', '1', '/datasync/prevention', 'C', '0', 'datasync:prevention:view', '#', 'admin', sysdate(), '', null, '网络数据防泄漏系统菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络数据防泄漏系统查询', @parentId, '1',  '#',  'F', '0', 'datasync:prevention:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络数据防泄漏系统新增', @parentId, '2',  '#',  'F', '0', 'datasync:prevention:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络数据防泄漏系统修改', @parentId, '3',  '#',  'F', '0', 'datasync:prevention:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络数据防泄漏系统删除', @parentId, '4',  '#',  'F', '0', 'datasync:prevention:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络数据防泄漏系统导出', @parentId, '5',  '#',  'F', '0', 'datasync:prevention:export',       '#', 'admin', sysdate(), '', null, '');
