-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('不间断配电', '2000', '1', '/datasync/uninterrupted', 'C', '0', 'datasync:uninterrupted:view', '#', 'admin', sysdate(), '', null, '不间断配电菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('不间断配电查询', @parentId, '1',  '#',  'F', '0', 'datasync:uninterrupted:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('不间断配电新增', @parentId, '2',  '#',  'F', '0', 'datasync:uninterrupted:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('不间断配电修改', @parentId, '3',  '#',  'F', '0', 'datasync:uninterrupted:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('不间断配电删除', @parentId, '4',  '#',  'F', '0', 'datasync:uninterrupted:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('不间断配电导出', @parentId, '5',  '#',  'F', '0', 'datasync:uninterrupted:export',       '#', 'admin', sysdate(), '', null, '');
