-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据库脱敏', '2000', '1', '/datasync/desensitization', 'C', '0', 'datasync:desensitization:view', '#', 'admin', sysdate(), '', null, '数据库脱敏菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据库脱敏查询', @parentId, '1',  '#',  'F', '0', 'datasync:desensitization:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据库脱敏新增', @parentId, '2',  '#',  'F', '0', 'datasync:desensitization:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据库脱敏修改', @parentId, '3',  '#',  'F', '0', 'datasync:desensitization:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据库脱敏删除', @parentId, '4',  '#',  'F', '0', 'datasync:desensitization:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('数据库脱敏导出', @parentId, '5',  '#',  'F', '0', 'datasync:desensitization:export',       '#', 'admin', sysdate(), '', null, '');
