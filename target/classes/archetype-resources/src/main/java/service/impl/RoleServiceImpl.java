/**
 * 
 */
package ${package}.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ${package}.model.Role;
import ${package}.repository.RoleRepository;
import ${package}.service.RoleService;

/**
 * @author WMS
 * 
 */
@Service("RoleService")
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository respository;

	public void setRespository(RoleRepository respository) {
		this.respository = respository;
	}

	/**
	 * 
	 */
	public RoleServiceImpl() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wms.studio.service.RoleService#save(com.wms.studio.model.Role)
	 */
	@Override
	public void save(Role role) {
		this.respository.save(role);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wms.studio.service.RoleService#delete(com.wms.studio.model.Role)
	 */
	@Override
	public void delete(Role role) {
		this.respository.delete(role);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wms.studio.service.RoleService#update(com.wms.studio.model.Role)
	 */
	@Override
	public void update(Role role) {
		this.respository.save(role);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wms.studio.service.RoleService#findById(int)
	 */
	@Override
	public Role findById(int id) {

		return this.respository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.wms.studio.service.RoleService#list(org.springframework.data.domain
	 * .Pageable)
	 */
	@Override
	public Page<Role> list(Pageable pageable) {

		return this.respository.findAll(pageable);
	}

}
