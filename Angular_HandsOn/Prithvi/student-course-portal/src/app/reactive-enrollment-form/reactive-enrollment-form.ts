import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormArray, AbstractControl, ValidationErrors, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Observable, of } from 'rxjs';
import { delay, map } from 'rxjs/operators';
import { EnrollmentService } from '../enrollment';

@Component({
  selector: 'app-reactive-enrollment-form',
  imports: [ReactiveFormsModule, CommonModule],
  providers: [EnrollmentService],
  templateUrl: './reactive-enrollment-form.html',
  styleUrl: './reactive-enrollment-form.css',
})
export class ReactiveEnrollmentForm implements OnInit {
  enrollmentForm!: FormGroup;

  constructor(private fb: FormBuilder, private enrollmentService: EnrollmentService) {}

  ngOnInit() {
    this.enrollmentForm = this.fb.group({
      studentName: ['', [Validators.required, Validators.minLength(3), this.noWhitespaceValidator]],
      course: ['', Validators.required],
      email: ['', [Validators.required, Validators.email], [this.checkEmailExistsValidator]],
      skills: this.fb.array([this.fb.control('', Validators.required)])
    });
  }

  get skills() {
    return this.enrollmentForm.get('skills') as FormArray;
  }

  addSkill() {
    this.skills.push(this.fb.control('', Validators.required));
  }

  removeSkill(index: number) {
    this.skills.removeAt(index);
  }

  onSubmit() {
    if (this.enrollmentForm.valid) {
      console.log('Reactive Enrollment Successful!', this.enrollmentForm.value);
      this.enrollmentService.enroll(
        this.enrollmentForm.value.studentName,
        this.enrollmentForm.value.course
      );
    } else {
      console.log('Form is invalid.');
    }
  }

  noWhitespaceValidator(control: AbstractControl): ValidationErrors | null {
    const isWhitespace = (control.value || '').trim().length === 0;
    const isValid = !isWhitespace;
    return isValid ? null : { 'whitespace': true };
  }

  checkEmailExistsValidator(control: AbstractControl): Observable<ValidationErrors | null> {
    const existingEmails = ['test@test.com', 'admin@admin.com'];
    return of(existingEmails.includes(control.value)).pipe(
      delay(1000),
      map(exists => exists ? { 'emailExists': true } : null)
    );
  }
}
