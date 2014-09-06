/**
 * 
 */
package ${package}.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ${package}.model.User;

/**
 * @author WMS
 *
 */
public interface UserService {

	public void save(User user);
	
	public void delete(User user);
	
	public void update(User user);
	
	public User findById(String id);
	
	public Page<User> list(Pageable pageable);
	
	public void updateState(User user);
	
	public User getCurrentUser();
	
	public Page<User> findLike(Pageable pageable,String searchtype,String searchvalue,boolean searchscope);
}
