import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-landing',
  imports: [RouterModule],
  templateUrl: './landing.html',
  styleUrl: './landing.scss'
})
export class Landing {

  constructor(private router: Router) {}

  onHome() {
    this.router.navigate(['/landing']);
  }

  onLogin() {
    this.router.navigate(['/login']);
  }

  onRegister() {
    this.router.navigate(['/register']);
  }

  onContact() {
    // Scroll to contact section
    const contactSection = document.getElementById('contact');
    if (contactSection) {
      contactSection.scrollIntoView({ 
        behavior: 'smooth',
        block: 'start'
      });
    }
  }

  onGetStarted() {
    this.router.navigate(['/register']);
  }

  onGetStartedHero() {
    this.router.navigate(['/register']);
  }
}
