import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-userhome',
  imports: [RouterModule],
  templateUrl: './userhome.html',
  styleUrl: './userhome.scss'
})
export class Userhome {
  constructor(private router: Router) {}

  navigateToStockInfo() {
    this.router.navigate(['/stockinfo']);
  }

  navigateToStockHistory() {
    this.router.navigate(['/stockhistory']);
  }

  navigateToWatchlist() {
    this.router.navigate(['/watchlist']);
  }

  navigateToAlert() {
    this.router.navigate(['/alert']);
  }

  navigateToReport() {
    this.router.navigate(['/report']);
  }

  navigateToLanding() {
    this.router.navigate(['/landing']);
  }
}
