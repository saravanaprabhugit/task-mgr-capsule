package com.stack.taskmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.stack.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TaskMgrController {

	@Autowired
	TaskServiceImpl taskService;

	
	@RequestMapping(value="/addTask", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String addTask(@RequestBody TaskVO task) {
		taskService.addTask(task);
		return "SUCCESSULLY ADDED";
	}
		
	@RequestMapping(value="/viewTask", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<TaskVO> viewtask() {
		return taskService.getAllTasks();
	}
	
	@RequestMapping(value="/deleteTask/{taskId}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<TaskVO> deleteTask(@PathVariable int taskId) {
		return taskService.deleteTask(taskId);
	}
	
	@RequestMapping(value="/updateTask", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String updateTask(@RequestBody TaskVO task) {
		taskService.editTask(task);
		return "UPDATED SUCCESSULLY";
	}

}
