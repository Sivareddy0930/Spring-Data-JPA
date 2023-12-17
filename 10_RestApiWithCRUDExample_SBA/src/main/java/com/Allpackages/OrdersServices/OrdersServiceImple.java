package com.Allpackages.OrdersServices;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Allpackages.OrdersEntity.EmployeesOrders;
import com.Allpackages.OrdersRepo.OrdersRepository;
@Service
public class OrdersServiceImple implements OrdersServiceInteface {
	
	@Autowired
	OrdersRepository Orepo;

	@Override
	public EmployeesOrders postOrders(EmployeesOrders eod) {
		// TODO Auto-generated method stub
		return Orepo.save(eod);
	}

	@Override
	public EmployeesOrders getOrders(Integer oid) {
		// TODO Auto-generated method stub
		return Orepo.findById(oid).get();
	}

	@Override
	public EmployeesOrders updateOrders(Integer oid, EmployeesOrders eod) {
		
		EmployeesOrders e=Orepo.getReferenceById(oid);
		
		if(Objects.nonNull(eod.getOrdername()) && !"".equalsIgnoreCase(eod.getOrdername())) {
			 e.setOrdername(eod.getOrdername());
		}
		
		if(Objects.nonNull(eod.getEmployeename()) && !"".equalsIgnoreCase(eod.getEmployeename())) {
			 e.setEmployeename(eod.getEmployeename());
		}
		if(Objects.nonNull(eod.getOrdercost()) && !"".equalsIgnoreCase(eod.getOrdercost().toString())) {
			 e.setOrdercost(eod.getOrdercost());
		}
		
		
		
		return Orepo.save(e);
	}

	@Override
	public String deleteOrders(Integer oid) {
		// TODO Auto-generated method stub
		Orepo.deleteById(oid);
		return "Deleted successfully";
	}

	@Override
	public List FindAll() {
		// TODO Auto-generated method stub
		return Orepo.findAll();
	}

	@Override
	public String saveAllEmployees(List<EmployeesOrders> empl) {
		
		Orepo.saveAll(empl);
		
		return "successfully updated";
		
		
	}

	@Override
	public Long countEmployees() {
		
		return Orepo.count();
	}

	@Override
	public Boolean existOrNot(Integer oid) {
		return Orepo.existsById(oid);
	}
	
	
}
