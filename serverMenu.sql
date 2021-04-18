-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('服务器', '2000', '1', '/datasync/server', 'C', '0', 'datasync:server:view', '#', 'admin', sysdate(), '', null, '服务器菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('服务器查询', @parentId, '1',  '#',  'F', '0', 'datasync:server:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('服务器新增', @parentId, '2',  '#',  'F', '0', 'datasync:server:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('服务器修改', @parentId, '3',  '#',  'F', '0', 'datasync:server:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('服务器删除', @parentId, '4',  '#',  'F', '0', 'datasync:server:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('服务器导出', @parentId, '5',  '#',  'F', '0', 'datasync:server:export',       '#', 'admin', sysdate(), '', null, '');
