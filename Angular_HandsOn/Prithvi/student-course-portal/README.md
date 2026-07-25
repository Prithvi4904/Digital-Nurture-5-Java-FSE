# Student Course Portal (Angular Hands-On Project)

This repository contains the complete implementation of the **Cognizant Digital Nurture 5.0 Angular Hands-On** module. It covers all 10 hands-on exercises, demonstrating modern Angular concepts, best practices, and a scalable architecture.

## Features & Implementation Details

### 1. Angular Basics & Architecture (Hands-on 1 & 2)
- Generated using the Angular CLI.
- Utilizes the modern **Standalone Components** architecture (no `ngModule`).
- Component-driven design including `Home`, `CourseList`, `CourseCard`, `StudentProfile`, `Header`, and `Admin`.

### 2. Directives & Pipes (Hands-on 3)
- **Structural Directives:** Utilized `@if` and `@for` (or `*ngIf`/`*ngFor`) for dynamic rendering.
- **Custom Directive:** Implemented `appHighlight` to dynamically change the background color of components.
- **Custom Pipe:** Implemented `creditLabel` to format numbers into a standardized "Credits" string representation.

### 3. Forms & Validation (Hands-on 4 & 5)
- **Template-Driven Forms:** Used `ngModel` with HTML5 validation (required, minlength, email).
- **Reactive Forms:** Used `FormBuilder` and `FormGroup` for robust, scalable form management.
- **Custom Synchronous Validation:** Built a custom validator (`noWhitespaceValidator`) to prevent purely whitespace entries.
- **Custom Asynchronous Validation:** Simulated backend API checks for existing emails using a custom async validator (`checkEmailExistsValidator`).
- **Dynamic Form Arrays:** Allowed users to dynamically add and remove "Skills" via `FormArray`.

### 4. Dependency Injection & Services (Hands-on 6)
- Designed highly cohesive services injected seamlessly via Angular's robust Dependency Injection.
- **CourseService:** A root-level service singleton for fetching global course data.
- **EnrollmentService:** A component-level scoped service demonstrating customized provider injection boundaries.

### 5. Routing & Navigation (Hands-on 7)
- **Nested and Parameterized Routing:** Deep linking using `ActivatedRoute` (e.g., `/course/:id`).
- **Programmatic Navigation:** Uses `Router.navigate` for dynamic logic-based transitions.
- **Lazy Loading:** Optimizes initial load speed by lazy loading the `AdminComponent`.
- **Route Protection:** Secures sensitive routes (like the Profile page) utilizing a functional `AuthGuard` (`CanActivateFn`).

### 6. HTTP Client Integration (Hands-on 8)
- Configured using the modern `provideHttpClient()` function in `app.config.ts`.
- Subscribes to observables to handle HTTP `GET` requests from a mock backend (`json-server`).
- Dynamic UI rendering based on `Observables` in `CourseListComponent`.

### 7. State Management with NgRx (Hands-on 9)
- Fully integrated Redux pattern using **NgRx Version 20**.
- **Store & Reducers:** Immutable global state management for the course list.
- **Actions:** Defined strict action payloads (`loadCourses`, `loadCoursesSuccess`, `loadCoursesFailure`).
- **Effects:** Uses `@ngrx/effects` to isolate side effects (HTTP calls) from components.
- **Selectors:** Utilizes memoized selectors consumed in components via the `async` pipe.

### 8. Unit Testing (Hands-on 10)
- End-to-end unit test suite configured via **Jasmine and Karma**.
- Achieves 100% passing tests (18/18) across the application.
- Uses `HttpTestingController` to test service API boundaries.
- Uses `provideMockStore` to test NgRx-connected components synchronously.

## How to Run the Application

1. **Install Dependencies:**
   ```bash
   npm install
   ```

2. **Start the Mock Backend (json-server):**
   Open a separate terminal and run:
   ```bash
   npx json-server --watch db.json
   ```

3. **Serve the Application:**
   ```bash
   ng serve
   ```
   Navigate to `http://localhost:4200/`.

## Running Unit Tests

To execute the unit tests via Karma and Jasmine:
```bash
ng test
```
*(Tests include comprehensive coverage for routing configuration, component rendering, mock stores, and HTTP testing).*

---
*Developed as part of the Digital Nurture 5.0 curriculum.*
