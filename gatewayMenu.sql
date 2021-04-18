-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全网关', '2000', '1', '/datasync/gateway', 'C', '0', 'datasync:gateway:view', '#', 'admin', sysdate(), '', null, '安全网关菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全网关查询', @parentId, '1',  '#',  'F', '0', 'datasync:gateway:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全网关新增', @parentId, '2',  '#',  'F', '0', 'datasync:gateway:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全网关修改', @parentId, '3',  '#',  'F', '0', 'datasync:gateway:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全网关删除', @parentId, '4',  '#',  'F', '0', 'datasync:gateway:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全网关导出', @parentId, '5',  '#',  'F', '0', 'datasync:gateway:export',       '#', 'admin', sysdate(), '', null, '');
