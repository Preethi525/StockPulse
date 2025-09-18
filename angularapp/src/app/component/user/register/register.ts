import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-register',
  imports: [RouterModule],
  templateUrl: './register.html',
  styleUrl: './register.scss'
})
export class Register {

  constructor(private router: Router) {}

  onHome() {
    this.router.navigate(['/landing']);
  }

  onLogin() {
    this.router.navigate(['/login']);
  }

  onRegister() {
    // Already on register page
  }

  onContact() {
    // Show contact information modal or alert
    const contactInfo = `
📞 Contact StockPulse Support

📧 Email: support@stockpulse.com
📱 Phone: +91 98765 43210
💬 WhatsApp: +91 98765 43210
🏢 Address: 
   StockPulse Technologies Pvt Ltd
   Tower A, Cyber City
   Gurgaon, Haryana 122002

🕒 Support Hours:
   Monday - Friday: 9:00 AM - 6:00 PM
   Saturday: 10:00 AM - 4:00 PM
   Sunday: Closed

💡 For urgent trading issues, call our 24/7 helpline:
   +91 98765 43211
    `;
    
    alert(contactInfo);
  }
}
