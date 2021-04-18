-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('基础软件', '2000', '1', '/datasync/software', 'C', '0', 'datasync:software:view', '#', 'admin', sysdate(), '', null, '基础软件菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('基础软件查询', @parentId, '1',  '#',  'F', '0', 'datasync:software:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('基础软件新增', @parentId, '2',  '#',  'F', '0', 'datasync:software:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('基础软件修改', @parentId, '3',  '#',  'F', '0', 'datasync:software:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('基础软件删除', @parentId, '4',  '#',  'F', '0', 'datasync:software:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('基础软件导出', @parentId, '5',  '#',  'F', '0', 'datasync:software:export',       '#', 'admin', sysdate(), '', null, '');
