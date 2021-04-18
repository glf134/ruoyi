-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一体化机柜', '2000', '1', '/datasync/cabinet', 'C', '0', 'datasync:cabinet:view', '#', 'admin', sysdate(), '', null, '一体化机柜菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一体化机柜查询', @parentId, '1',  '#',  'F', '0', 'datasync:cabinet:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一体化机柜新增', @parentId, '2',  '#',  'F', '0', 'datasync:cabinet:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一体化机柜修改', @parentId, '3',  '#',  'F', '0', 'datasync:cabinet:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一体化机柜删除', @parentId, '4',  '#',  'F', '0', 'datasync:cabinet:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('一体化机柜导出', @parentId, '5',  '#',  'F', '0', 'datasync:cabinet:export',       '#', 'admin', sysdate(), '', null, '');
