package cn.gnux.core.utils.db.handler;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashSet;

import cn.gnux.core.utils.db.Entity;


/**
 * 结果集处理类 ，处理出的结果为Entity列表
 * @author 
 *
 */
public class EntitySetHandler implements RsHandler<LinkedHashSet<Entity>>{
	
	/**
	 * 创建一个 EntityHandler对象
	 * @return EntityHandler对象
	 */
	public static EntitySetHandler create() {
		return new EntitySetHandler();
	}

	@Override
	public LinkedHashSet<Entity> handle(ResultSet rs) throws SQLException {
		return HandleHelper.handleRs(rs, new LinkedHashSet<Entity>());
	}
}
