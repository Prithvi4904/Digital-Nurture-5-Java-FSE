import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EnrollmentService {
  enroll(studentName: string, course: string) {
    console.log(studentName + ' enrolled in ' + course);
  }
}
