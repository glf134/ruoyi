-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('邮件安全过滤系统', '2000', '1', '/datasync/filtering', 'C', '0', 'datasync:filtering:view', '#', 'admin', sysdate(), '', null, '邮件安全过滤系统菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('邮件安全过滤系统查询', @parentId, '1',  '#',  'F', '0', 'datasync:filtering:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('邮件安全过滤系统新增', @parentId, '2',  '#',  'F', '0', 'datasync:filtering:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('邮件安全过滤系统修改', @parentId, '3',  '#',  'F', '0', 'datasync:filtering:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('邮件安全过滤系统删除', @parentId, '4',  '#',  'F', '0', 'datasync:filtering:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('邮件安全过滤系统导出', @parentId, '5',  '#',  'F', '0', 'datasync:filtering:export',       '#', 'admin', sysdate(), '', null, '');
