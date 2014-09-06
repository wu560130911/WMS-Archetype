/**
 * 
 */
package ${package}.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ${package}.model.Role;

/**
 * @author WMS
 *
 */
public interface RoleService {

	public void save(Role role);
	
	public void delete(Role role);
	
	public void update(Role role);
	
	public Role findById(int id);
	
	public Page<Role> list(Pageable pageable);
}
