import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, BehaviorSubject } from 'rxjs';
import { map } from 'rxjs/operators';

export interface StockData {
  symbol: string;
  price: number;
  change: number;
  changePercent: number;
  volume: number;
  high: number;
  low: number;
  open: number;
  previousClose: number;
}

export interface HistoricalData {
  date: string;
  open: number;
  high: number;
  low: number;
  close: number;
  volume: number;
}

export interface NewsItem {
  title: string;
  summary: string;
  source: string;
  publishedAt: string;
  url: string;
}

@Injectable({
  providedIn: 'root'
})
export class StockService {
  private apiKey = 'demo'; // Replace with your actual API key
  private baseUrl = 'https://api.example.com'; // Replace with actual API URL
  
  private currentStockSubject = new BehaviorSubject<StockData | null>(null);
  public currentStock$ = this.currentStockSubject.asObservable();

  constructor(private http: HttpClient) {}

  // Get real-time stock data
  getStockData(symbol: string): Observable<StockData> {
    // This is a mock implementation - replace with actual API call
    return this.http.get<StockData>(`${this.baseUrl}/stock/${symbol}`).pipe(
      map(data => {
        this.currentStockSubject.next(data);
        return data;
      })
    );
  }

  // Get historical data for charts
  getHistoricalData(symbol: string, period: string = '1M'): Observable<HistoricalData[]> {
    // This is a mock implementation - replace with actual API call
    return this.http.get<HistoricalData[]>(`${this.baseUrl}/stock/${symbol}/history?period=${period}`);
  }

  // Get news related to the stock
  getStockNews(symbol: string): Observable<NewsItem[]> {
    // This is a mock implementation - replace with actual API call
    return this.http.get<NewsItem[]>(`${this.baseUrl}/stock/${symbol}/news`);
  }

  // Mock data for demonstration
  getMockStockData(symbol: string): Observable<StockData> {
    const mockData: StockData = {
      symbol: symbol.toUpperCase(),
      price: 150.25 + Math.random() * 10,
      change: (Math.random() - 0.5) * 5,
      changePercent: (Math.random() - 0.5) * 10,
      volume: Math.floor(Math.random() * 1000000) + 100000,
      high: 155.50 + Math.random() * 5,
      low: 145.00 + Math.random() * 5,
      open: 148.75 + Math.random() * 5,
      previousClose: 149.80 + Math.random() * 5
    };
    
    return new Observable(observer => {
      setTimeout(() => {
        this.currentStockSubject.next(mockData);
        observer.next(mockData);
        observer.complete();
      }, 500);
    });
  }

  getMockHistoricalData(symbol: string): Observable<HistoricalData[]> {
    const data: HistoricalData[] = [];
    const today = new Date();
    
    for (let i = 29; i >= 0; i--) {
      const date = new Date(today);
      date.setDate(date.getDate() - i);
      
      const basePrice = 150 + Math.random() * 20;
      const open = basePrice + (Math.random() - 0.5) * 2;
      const close = open + (Math.random() - 0.5) * 4;
      const high = Math.max(open, close) + Math.random() * 2;
      const low = Math.min(open, close) - Math.random() * 2;
      
      data.push({
        date: date.toISOString().split('T')[0],
        open: parseFloat(open.toFixed(2)),
        high: parseFloat(high.toFixed(2)),
        low: parseFloat(low.toFixed(2)),
        close: parseFloat(close.toFixed(2)),
        volume: Math.floor(Math.random() * 500000) + 100000
      });
    }
    
    return new Observable(observer => {
      setTimeout(() => {
        observer.next(data);
        observer.complete();
      }, 300);
    });
  }

  getMockNews(symbol: string): Observable<NewsItem[]> {
    const mockNews: NewsItem[] = [
      {
        title: `${symbol} Reports Strong Q3 Earnings`,
        summary: `The company exceeded expectations with revenue growth of 15% year-over-year.`,
        source: 'Financial Times',
        publishedAt: new Date().toISOString(),
        url: '#'
      },
      {
        title: `Analysts Upgrade ${symbol} to Buy Rating`,
        summary: `Several major investment firms have upgraded their rating based on positive outlook.`,
        source: 'Bloomberg',
        publishedAt: new Date(Date.now() - 86400000).toISOString(),
        url: '#'
      },
      {
        title: `${symbol} Announces New Product Launch`,
        summary: `The company unveiled its latest innovation that could drive future growth.`,
        source: 'Reuters',
        publishedAt: new Date(Date.now() - 172800000).toISOString(),
        url: '#'
      }
    ];
    
    return new Observable(observer => {
      setTimeout(() => {
        observer.next(mockNews);
        observer.complete();
      }, 200);
    });
  }
}
