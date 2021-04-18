-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('路由器', '2000', '1', '/datasync/router', 'C', '0', 'datasync:router:view', '#', 'admin', sysdate(), '', null, '路由器菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('路由器查询', @parentId, '1',  '#',  'F', '0', 'datasync:router:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('路由器新增', @parentId, '2',  '#',  'F', '0', 'datasync:router:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('路由器修改', @parentId, '3',  '#',  'F', '0', 'datasync:router:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('路由器删除', @parentId, '4',  '#',  'F', '0', 'datasync:router:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('路由器导出', @parentId, '5',  '#',  'F', '0', 'datasync:router:export',       '#', 'admin', sysdate(), '', null, '');
