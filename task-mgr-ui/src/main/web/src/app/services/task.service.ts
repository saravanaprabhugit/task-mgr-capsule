import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { Task } from '../addtask/task';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' ,'headers':'GET, POST, DELETE, PUT'})
};

@Injectable()
export class TaskService {
  private userUrl = 'http://localhost:6050';
  constructor(private http: HttpClient) { }

  public addTask(task) {  
    return this.http.post<Task>(this.userUrl+'/addTask', task);
  }

  public viewTask() {
    return this.http.get<Task[]>(this.userUrl+'/viewTask');
  }
  public updateTask(task){
return this.http.post<string>(this.userUrl+'/updateTask/',task);
  }

  public endTask(taskId){
    return this.http.get<Task[]>(this.userUrl+'/deleteTask/'+taskId);
      }
}