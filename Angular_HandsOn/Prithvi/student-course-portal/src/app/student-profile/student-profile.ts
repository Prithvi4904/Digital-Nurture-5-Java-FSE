import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CreditLabelPipe } from '../credit-label-pipe';

@Component({
  selector: 'app-student-profile',
  imports: [CommonModule, CreditLabelPipe],
  templateUrl: './student-profile.html',
  styleUrl: './student-profile.css',
})
export class StudentProfile {
  studentName = 'John Doe';
  age = 20;
  enrolledCourses = ['Angular Basics', 'Web Development'];
  isEligible = this.age >= 18;
  courseProgress: { [key: string]: number } = { 'Angular Basics': 100, 'Web Development': 40 };
  fee = 1500;
  enrollmentDate = new Date();
}
