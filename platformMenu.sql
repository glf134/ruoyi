-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全管理平台', '2000', '1', '/datasync/platform', 'C', '0', 'datasync:platform:view', '#', 'admin', sysdate(), '', null, '安全管理平台菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全管理平台查询', @parentId, '1',  '#',  'F', '0', 'datasync:platform:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全管理平台新增', @parentId, '2',  '#',  'F', '0', 'datasync:platform:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全管理平台修改', @parentId, '3',  '#',  'F', '0', 'datasync:platform:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全管理平台删除', @parentId, '4',  '#',  'F', '0', 'datasync:platform:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全管理平台导出', @parentId, '5',  '#',  'F', '0', 'datasync:platform:export',       '#', 'admin', sysdate(), '', null, '');
