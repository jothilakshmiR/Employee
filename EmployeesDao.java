package com.program.Employees;


	import java.util.Date;

	import java.util.List;
	 
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.Transaction;
	 
	
	 
	public class EmployeesDao {
	 
	    public List<EmployeesDao> getEmployeeList(){
	 
	        Session session = null;
	        List<EmployeesDao> empList = null;
	        try {
	            session = HibernateUtility.getSession();
	            String queryStr = "select emp from Employee emp";
	            Query query = session.createQuery(queryStr);
	            empList = query.list();
	        } catch(Exception ex) {
	            ex.printStackTrace();
	            // handle exception here
	        } finally {
	            try {if(session != null) session.close();} catch(Exception ex) {}
	        }
	        return empList;
	    }
	 
	    public EmployeesDao getEmployeeById(Long empId){
	 
	        Session session = null;
	        EmployeesDao emp = null;
	        try {
	            session =HibernateUtility.getSession();
	            String queryStr = "select emp from Employee emp";
	            emp = (EmployeesDao) session.get(EmployeesDao.class, empId);
	 
	        } catch(Exception ex) {
	            ex.printStackTrace();
	            // handle exception here
	        } finally {
	            try {if(session != null) session.close();} catch(Exception ex) {}
	        }
	        return emp;
	    }
	 
	    public void insertEmployee(EmployeesDao emp) {
	 
	        Session session = null;
	        Transaction transaction = null;
	        try {
	            session =HibernateUtility.getSession();
	            transaction = session.beginTransaction();
	            session.save(emp);
	            System.out.println("inserted employee: "+emp.getName());
	            transaction.commit();
	        } catch(Exception ex) {
	            ex.printStackTrace();
	            // handle exception here
	            if(transaction != null) transaction.rollback();
	        } finally {
	            try {if(session != null) session.close();} catch(Exception ex) {}
	        }
	    }
	 
	    private String getName() {
			// TODO Auto-generated method stub
			return null;
		}

		public void deleteEmployee(EmployeesDao emp) {
	 
	        Session session = null;
	        Transaction transaction = null;
	        try {
	            session = HibernateUtility.getSession();
	            transaction = session.beginTransaction();
	            session.delete(emp);
	            transaction.commit();
	            System.out.println("deleted employee: "+emp.getName());
	        } catch(Exception ex) {
	            ex.printStackTrace();
	            // handle exception here
	            if(transaction != null) transaction.rollback();
	        } finally {
	            try {if(session != null) session.close();} catch(Exception ex) {}
	        }
	    }
	 
	    public static void main(String a[]) {
	 
	        EmployeesDao empDao = new EmployeesDao();
	 
	        EmployeesDao program = new EmployeesDao();
	       program.setName("Ajay");
	        program.setDepartment("Security");
	        program.setJoinedOn(new Date());
	       program.setSalary(new Long(5250));
	        empDao.insertEmployee(program);
	 
	        System.out.println("---------------------------");
	 
	        List<EmployeesDao> empList = empDao.getEmployeeList();
	        System.out.println("emp size: "+empList.size());
	        empList.stream().forEach(System.out::println);
	 
	        System.out.println("---------------------------");
	 
	        EmployeesDao empObj = empDao.getEmployeeById(program.getId());
	        System.out.println(empObj);
	 
	        System.out.println("---------------------------");
	        empDao.deleteEmployee(empObj);
	 
	        System.out.println("---------------------------");
	 
	        empList = empDao.getEmployeeList();
	        System.out.println("emp size: "+empList.size());
	        empList.stream().forEach(System.out::println);
	 
	        System.out.println("---------------------------");
	    }

		private void setSalary(Long long1) {
			
			
		}

		private void setJoinedOn(Date date) {
			
		}

		private void setDepartment(String string) {
			
			
		}

		private void setName(String string) {
		}

		private Long getId() {
			
			return null;
		}
	}

		
