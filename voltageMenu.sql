-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('低压配电', '2000', '1', '/datasync/voltage', 'C', '0', 'datasync:voltage:view', '#', 'admin', sysdate(), '', null, '低压配电菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('低压配电查询', @parentId, '1',  '#',  'F', '0', 'datasync:voltage:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('低压配电新增', @parentId, '2',  '#',  'F', '0', 'datasync:voltage:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('低压配电修改', @parentId, '3',  '#',  'F', '0', 'datasync:voltage:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('低压配电删除', @parentId, '4',  '#',  'F', '0', 'datasync:voltage:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('低压配电导出', @parentId, '5',  '#',  'F', '0', 'datasync:voltage:export',       '#', 'admin', sysdate(), '', null, '');
