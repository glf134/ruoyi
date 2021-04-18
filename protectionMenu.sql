-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消防系统', '2000', '1', '/datasync/protection', 'C', '0', 'datasync:protection:view', '#', 'admin', sysdate(), '', null, '消防系统菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消防系统查询', @parentId, '1',  '#',  'F', '0', 'datasync:protection:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消防系统新增', @parentId, '2',  '#',  'F', '0', 'datasync:protection:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消防系统修改', @parentId, '3',  '#',  'F', '0', 'datasync:protection:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消防系统删除', @parentId, '4',  '#',  'F', '0', 'datasync:protection:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('消防系统导出', @parentId, '5',  '#',  'F', '0', 'datasync:protection:export',       '#', 'admin', sysdate(), '', null, '');
