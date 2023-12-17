package com.Allpackages.OrdersEntity;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmployeesOrders {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column
	Integer orderid;
	@Column
	String ordername;
	@Column
	String employeename;
	@Column
	Double ordercost;
	
}
