-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁盘阵列', '2000', '1', '/datasync/array', 'C', '0', 'datasync:array:view', '#', 'admin', sysdate(), '', null, '磁盘阵列菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁盘阵列查询', @parentId, '1',  '#',  'F', '0', 'datasync:array:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁盘阵列新增', @parentId, '2',  '#',  'F', '0', 'datasync:array:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁盘阵列修改', @parentId, '3',  '#',  'F', '0', 'datasync:array:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁盘阵列删除', @parentId, '4',  '#',  'F', '0', 'datasync:array:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁盘阵列导出', @parentId, '5',  '#',  'F', '0', 'datasync:array:export',       '#', 'admin', sysdate(), '', null, '');
