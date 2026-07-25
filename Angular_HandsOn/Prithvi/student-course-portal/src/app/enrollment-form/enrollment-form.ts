import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-enrollment-form',
  imports: [FormsModule, CommonModule],
  templateUrl: './enrollment-form.html',
  styleUrl: './enrollment-form.css',
})
export class EnrollmentForm {
  studentName = '';
  course = '';
  email = '';

  onSubmit(form: any) {
    if (form.valid) {
      console.log('Enrollment Successful!', form.value);
    } else {
      console.log('Form is invalid.');
    }
  }
}
