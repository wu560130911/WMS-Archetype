/**
 * 
 */
package ${package}.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ${package}.model.Role;
import ${package}.model.User;

/**
 * @author WMS
 *
 */
public interface UserRepository extends JpaRepository<User, String> {

	public Page<User> findByIdLike(String id,Pageable pageable);
	
	public Page<User> findByNameLike(String name,Pageable pageable);
	
	public Page<User> findByRoles(Role roles,Pageable pageable);
}
