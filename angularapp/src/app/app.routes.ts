import { RouterModule, Routes } from '@angular/router';

import { Login } from './component/user/login/login';
import { Register } from './component/user/register/register';
import { Stockhistory } from './component/user/stockhistory/stockhistory';
import { Stockinfo } from './component/user/stockinfo/stockinfo';
import { Watchlist } from './component/user/watchlist/watchlist';
import { Landing } from './component/user/landing/landing';
import { Userhome } from './component/user/userhome/userhome';
import { Alert } from './component/user/alert/alert';
import { Report } from './component/user/report/report';




export const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: Login },
  { path: 'register', component: Register },
  { path: 'landing', component: Landing },
  { path: 'userhome', component: Userhome },
  { path: 'stockinfo', component: Stockinfo },
  { path: 'stockhistory', component: Stockhistory },
  { path: 'watchlist', component: Watchlist },
  { path: 'alert', component: Alert },
  { path: 'report', component: Report }
];