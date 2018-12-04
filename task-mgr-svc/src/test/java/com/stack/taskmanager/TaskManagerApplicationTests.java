package com.stack.taskmanager;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskManagerApplicationTests {

	@Autowired
	private TaskServiceImpl svcTests;
	
	@Test
	public void viewtask() {
		System.out.println("view task   ");
		svcTests.getAllTasks();
	}
	
	@Test
	public void addtask() {
		System.out.println("view task   ");
		TaskVO addVO = new TaskVO();	
		addVO.setTaskId(1);
		addVO.setParentTask("t1");
		addVO.setParentTask("T2");
		addVO.setPriority(20);
		addVO.setStartDate(new Date(2019, 1, 1));
		addVO.setEndDate(new Date(2019, 2, 2));
		svcTests.addTask(addVO);
	}
	
	@Test
	public void delete() {
		System.out.println("delete task   ");
		svcTests.deleteTask(4);
	}
	
	@Test
	public void update() {
		System.out.println("update task   ");
		TaskVO updateVO = new TaskVO();	
		updateVO.setTaskId(1);
		updateVO.setPriority(30);
		svcTests.editTask(updateVO);
	}


}
