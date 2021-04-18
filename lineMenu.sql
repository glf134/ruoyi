-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路', '2000', '1', '/datasync/line', 'C', '0', 'datasync:line:view', '#', 'admin', sysdate(), '', null, '网络线路菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路查询', @parentId, '1',  '#',  'F', '0', 'datasync:line:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路新增', @parentId, '2',  '#',  'F', '0', 'datasync:line:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路修改', @parentId, '3',  '#',  'F', '0', 'datasync:line:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路删除', @parentId, '4',  '#',  'F', '0', 'datasync:line:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('网络线路导出', @parentId, '5',  '#',  'F', '0', 'datasync:line:export',       '#', 'admin', sysdate(), '', null, '');
