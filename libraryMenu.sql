-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁带库', '2000', '1', '/datasync/library', 'C', '0', 'datasync:library:view', '#', 'admin', sysdate(), '', null, '磁带库菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁带库查询', @parentId, '1',  '#',  'F', '0', 'datasync:library:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁带库新增', @parentId, '2',  '#',  'F', '0', 'datasync:library:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁带库修改', @parentId, '3',  '#',  'F', '0', 'datasync:library:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁带库删除', @parentId, '4',  '#',  'F', '0', 'datasync:library:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('磁带库导出', @parentId, '5',  '#',  'F', '0', 'datasync:library:export',       '#', 'admin', sysdate(), '', null, '');
