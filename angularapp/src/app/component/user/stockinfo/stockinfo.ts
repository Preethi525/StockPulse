import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

interface StockData {
  symbol: string;
  companyName: string;
  currentPrice: number;
  market: string;
  status: 'Active' | 'Inactive' | 'Suspended';
  change: number;
  changePercent: number;
  volume: number;
  marketCap: string;
}

@Component({
  selector: 'app-stockinfo',
  imports: [RouterModule, CommonModule],
  templateUrl: './stockinfo.html',
  styleUrl: './stockinfo.scss'
})
export class Stockinfo {
  stockData: StockData[] = [
    {
      symbol: 'AAPL',
      companyName: 'Apple Inc.',
      currentPrice: 175.43,
      market: 'NASDAQ',
      status: 'Active',
      change: 2.15,
      changePercent: 1.24,
      volume: 45678900,
      marketCap: '2.8T'
    },
    {
      symbol: 'GOOGL',
      companyName: 'Alphabet Inc.',
      currentPrice: 142.56,
      market: 'NASDAQ',
      status: 'Active',
      change: -1.23,
      changePercent: -0.86,
      volume: 23456700,
      marketCap: '1.8T'
    },
    {
      symbol: 'MSFT',
      companyName: 'Microsoft Corporation',
      currentPrice: 378.85,
      market: 'NASDAQ',
      status: 'Active',
      change: 5.67,
      changePercent: 1.52,
      volume: 18923400,
      marketCap: '2.9T'
    },
    {
      symbol: 'TSLA',
      companyName: 'Tesla Inc.',
      currentPrice: 248.12,
      market: 'NASDAQ',
      status: 'Active',
      change: -3.45,
      changePercent: -1.37,
      volume: 67890100,
      marketCap: '790B'
    },
    {
      symbol: 'AMZN',
      companyName: 'Amazon.com Inc.',
      currentPrice: 155.23,
      market: 'NASDAQ',
      status: 'Active',
      change: 1.89,
      changePercent: 1.23,
      volume: 34567800,
      marketCap: '1.6T'
    }
  ];

  constructor(private router: Router) {}

  navigateToUserHome() {
    this.router.navigate(['/userhome']);
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

  getStatusClass(status: string): string {
    switch (status) {
      case 'Active':
        return 'status-active';
      case 'Inactive':
        return 'status-inactive';
      case 'Suspended':
        return 'status-suspended';
      default:
        return 'status-active';
    }
  }

  getChangeClass(change: number): string {
    return change >= 0 ? 'change-positive' : 'change-negative';
  }
}
