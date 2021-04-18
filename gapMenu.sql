-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全隔离网闸数据元（GAP）', '2000', '1', '/datasync/gap', 'C', '0', 'datasync:gap:view', '#', 'admin', sysdate(), '', null, '安全隔离网闸数据元（GAP）菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全隔离网闸数据元（GAP）查询', @parentId, '1',  '#',  'F', '0', 'datasync:gap:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全隔离网闸数据元（GAP）新增', @parentId, '2',  '#',  'F', '0', 'datasync:gap:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全隔离网闸数据元（GAP）修改', @parentId, '3',  '#',  'F', '0', 'datasync:gap:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全隔离网闸数据元（GAP）删除', @parentId, '4',  '#',  'F', '0', 'datasync:gap:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('安全隔离网闸数据元（GAP）导出', @parentId, '5',  '#',  'F', '0', 'datasync:gap:export',       '#', 'admin', sysdate(), '', null, '');
