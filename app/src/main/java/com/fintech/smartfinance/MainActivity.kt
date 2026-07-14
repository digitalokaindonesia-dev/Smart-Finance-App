<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Smart Finance - Premium Android Emulator</title>
    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>
    <!-- Google Fonts Inter -->
    <link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
    <!-- Font Awesome Icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    
    <style>
        body {
            font-family: 'Inter', sans-serif;
            background-color: #F8FAFC;
            color: #0F172A;
        }
        /* Custom Scrollbar for minimal feel */
        ::-webkit-scrollbar {
            width: 4px;
            height: 4px;
        }
        ::-webkit-scrollbar-track {
            background: #F1F5F9;
        }
        ::-webkit-scrollbar-thumb {
            background: #10B981;
            border-radius: 10px;
        }
        /* Soft Premium Shadowing */
        .soft-shadow {
            box-shadow: 0 4px 30px rgba(0, 0, 0, 0.02);
        }
        .phone-shadow {
            box-shadow: 0 25px 70px -10px rgba(16, 185, 129, 0.08), 0 10px 30px -15px rgba(0, 0, 0, 0.05);
        }
        /* Pulse emerald animation */
        @keyframes pulse-emerald {
            0%, 100% { transform: scale(1); opacity: 1; }
            50% { transform: scale(1.03); opacity: 0.9; }
        }
        .animate-pulse-emerald {
            animation: pulse-emerald 3s infinite;
        }
    </style>
    
    <script>
        tailwind.config = {
            theme: {
                extend: {
                    colors: {
                        finWhite: '#FFFFFF',
                        finBgLight: '#F8FAFC',
                        finGrayBorder: '#E2E8F0',
                        finGreen: '#10B981',
                        finGreenHover: '#059669',
                        finGreenLight: '#E6F4EA',
                        finTextDark: '#0F172A',
                        finTextMuted: '#64748B',
                        dangerRed: '#EF4444',
                        dangerLight: '#FEE2E2'
                    }
                }
            }
        }
    </script>
</head>
<body class="min-h-screen flex items-center justify-center p-4 lg:p-8 bg-slate-50">

    <!-- MAIN WORKSPACE SIDE-BY-SIDE -->
    <div class="w-full max-w-6xl grid grid-cols-1 lg:grid-cols-12 gap-8 items-center">
        
        <!-- LEFT SIDE: DESKTOP CONTROL CENTER & SPECS -->
        <div class="lg:col-span-5 space-y-6">
            <div class="space-y-3">
                <div class="inline-flex items-center gap-2 px-3 py-1 rounded-full bg-emerald-50 text-emerald-600 border border-emerald-100 text-xs font-semibold">
                    <i class="fa-solid fa-mobile-screen-button"></i> Premium Minimalist UI
                </div>
                <h1 class="text-3xl lg:text-4xl font-extrabold tracking-tight text-finTextDark">Smart Finance</h1>
                <p class="text-sm text-finTextMuted leading-relaxed">
                    Visualisasi konsep antarmuka premium berbasis Jetpack Compose & Clean Architecture. Desain dirancang ulang dengan pendekatan minimalis, paduan kontras warna putih bersih dan hijau finansial untuk keterbacaan tingkat tinggi.
                </p>
            </div>

            <!-- Features Showcase Checklist -->
            <div class="bg-white p-5 rounded-2xl border border-finGrayBorder soft-shadow space-y-4">
                <h3 class="text-xs font-bold text-finGreen tracking-wider uppercase"><i class="fa-solid fa-shield-halved mr-2"></i>Status Emulator Aktif</h3>
                <ul class="space-y-3 text-xs text-finTextMuted">
                    <li class="flex items-start gap-2.5">
                        <i class="fa-solid fa-circle-check text-finGreen mt-0.5"></i> 
                        <span><strong>PIN Security:</strong> Gunakan kode PIN <code class="text-finGreen font-mono bg-emerald-50 px-1.5 py-0.5 rounded">1234</code> atau ketuk tombol sidik jari untuk login.</span>
                    </li>
                    <li class="flex items-start gap-2.5">
                        <i class="fa-solid fa-circle-check text-finGreen mt-0.5"></i> 
                        <span><strong>Minimalist UI:</strong> Mengurangi ornamen warna gelap untuk performa visual yang bersih dan modern.</span>
                    </li>
                    <li class="flex items-start gap-2.5">
                        <i class="fa-solid fa-circle-check text-finGreen mt-0.5"></i> 
                        <span><strong>Reaktif & Interaktif:</strong> Seluruh mutasi budget dan transaksi digambar langsung pada Canvas API.</span>
                    </li>
                </ul>
            </div>

            <!-- Real-time Console Logger -->
            <div class="bg-white p-4 rounded-xl border border-finGrayBorder font-mono text-[11px] text-finGreen space-y-1 max-h-[140px] overflow-y-auto soft-shadow" id="consoleLog">
                <div class="text-slate-400">[SYSTEM] MVVM Finance Engine Initialized.</div>
                <div class="text-slate-400">[ROOM_DB] Connection active. Loaded tables [Transaction, Wallet, Budget].</div>
                <div>[DATASTORE] Light preferences successfully set as default theme.</div>
            </div>
        </div>

        <!-- RIGHT SIDE: PREMIUM SMARTPHONE EMULATOR -->
        <div class="lg:col-span-7 flex justify-center">
            <!-- Smartphone Shell Container (Premium Silver-Gray Rim) -->
            <div class="relative w-[370px] h-[780px] bg-slate-100 rounded-[48px] p-3 phone-shadow border-4 border-slate-200 flex flex-col overflow-hidden">
                
                <!-- Notch / Island -->
                <div class="absolute top-4 left-1/2 transform -translate-x-1/2 w-28 h-5 bg-slate-200 rounded-full z-50 flex items-center justify-center">
                    <div class="w-2 h-2 bg-slate-400 rounded-full mr-1.5"></div>
                    <div class="w-12 h-1 bg-slate-300 rounded-full"></div>
                </div>

                <!-- Phone Status Bar -->
                <div class="flex justify-between items-center px-6 pt-2 pb-1.5 text-[11px] font-bold text-slate-500 z-40 select-none">
                    <span id="statusBarTime">12:30</span>
                    <div class="flex items-center gap-1.5">
                        <i class="fa-solid fa-signal"></i>
                        <i class="fa-solid fa-wifi"></i>
                        <i class="fa-solid fa-battery-three-quarters text-finGreen"></i>
                    </div>
                </div>

                <!-- PHONE SCREEN CONTAINER -->
                <div class="flex-1 rounded-[38px] bg-white relative overflow-y-auto flex flex-col border border-slate-100" id="phoneScreen">
                    
                    <!-- SCREEN 1: LOGIN/PIN LOCK (DEFAULT ACTIVE) -->
                    <div id="screenLock" class="absolute inset-0 bg-white z-40 flex flex-col justify-between p-6 transition-all duration-300">
                        <div class="text-center mt-12 space-y-3">
                            <div class="w-16 h-16 rounded-3xl bg-emerald-50 border border-emerald-100 flex items-center justify-center mx-auto animate-pulse-emerald">
                                <i class="fa-solid fa-wallet text-finGreen text-2xl"></i>
                            </div>
                            <h2 class="text-xl font-extrabold tracking-tight text-finTextDark">Smart Finance</h2>
                            <p class="text-xs text-finTextMuted">Masukkan PIN Keamanan untuk Masuk</p>
                        </div>

                        <!-- PIN Dots Indicators -->
                        <div class="flex justify-center gap-4 my-6">
                            <div class="pin-dot w-3.5 h-3.5 rounded-full border-2 border-slate-200 transition-all duration-200"></div>
                            <div class="pin-dot w-3.5 h-3.5 rounded-full border-2 border-slate-200 transition-all duration-200"></div>
                            <div class="pin-dot w-3.5 h-3.5 rounded-full border-2 border-slate-200 transition-all duration-200"></div>
                            <div class="pin-dot w-3.5 h-3.5 rounded-full border-2 border-slate-200 transition-all duration-200"></div>
                        </div>

                        <!-- PIN Numeric Numpad -->
                        <div class="grid grid-cols-3 gap-3 mb-8 text-center px-4">
                            <button onclick="pressPin('1')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">1</button>
                            <button onclick="pressPin('2')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">2</button>
                            <button onclick="pressPin('3')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">3</button>
                            <button onclick="pressPin('4')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">4</button>
                            <button onclick="pressPin('5')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">5</button>
                            <button onclick="pressPin('6')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">6</button>
                            <button onclick="pressPin('7')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">7</button>
                            <button onclick="pressPin('8')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">8</button>
                            <button onclick="pressPin('9')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">9</button>
                            
                            <!-- Fingerprint Quick Action -->
                            <button onclick="simulateBiometric()" class="h-12 rounded-xl bg-slate-50 border border-slate-100 flex items-center justify-center hover:bg-emerald-50 text-finGreen active:scale-95 transition-all">
                                <i class="fa-solid fa-fingerprint text-lg"></i>
                            </button>
                            <button onclick="pressPin('0')" class="h-12 rounded-xl bg-slate-50 border border-slate-100 text-base font-bold text-finTextDark hover:bg-emerald-50 active:scale-95 transition-all">0</button>
                            <!-- Backspace -->
                            <button onclick="clearPin()" class="h-12 rounded-xl bg-slate-50 border border-slate-100 flex items-center justify-center hover:bg-red-50 text-dangerRed active:scale-95 transition-all">
                                <i class="fa-solid fa-delete-left"></i>
                            </button>
                        </div>
                    </div>

                    <!-- SCREEN PANEL INNER LAYOUT (WILL BE TOGGLED VISIBLE ON SUCCESSFUL LOGIN) -->
                    <div id="screenApp" class="hidden flex-1 flex-col pb-16">
                        
                        <!-- APP HEADER -->
                        <div class="px-5 pt-4 pb-2 flex justify-between items-center">
                            <div>
                                <p class="text-[9px] text-finTextMuted uppercase tracking-wider font-semibold">Selamat Datang,</p>
                                <h3 class="text-sm font-extrabold text-finTextDark">Pengelola Keuangan</h3>
                            </div>
                            <div class="flex items-center gap-2">
                                <div class="w-8 h-8 rounded-full bg-emerald-50 border border-emerald-100 flex items-center justify-center text-finGreen text-xs">
                                    <i class="fa-solid fa-circle-user"></i>
                                </div>
                            </div>
                        </div>

                        <!-- DYNAMIC INNER CONTAINER -->
                        <div id="appContainer" class="flex-1 px-5 overflow-y-auto space-y-4">
                            <!-- Dynamic Content Injected Here by JS -->
                        </div>

                        <!-- NAVIGATION BOTTOM MENU (FIXED TO FOOTER) -->
                        <div class="absolute bottom-0 left-0 right-0 h-16 bg-white/95 backdrop-blur-md border-t border-slate-100 flex justify-around items-center px-2 z-30">
                            <button onclick="switchTab('dashboard')" id="tab-dashboard" class="flex flex-col items-center justify-center flex-1 py-1 text-finGreen transition-all">
                                <i class="fa-solid fa-house-chimney text-xs"></i>
                                <span class="text-[9px] mt-1 font-medium">Beranda</span>
                            </button>
                            <button onclick="switchTab('transaksi')" id="tab-transaksi" class="flex flex-col items-center justify-center flex-1 py-1 text-finTextMuted transition-all">
                                <i class="fa-solid fa-receipt text-xs"></i>
                                <span class="text-[9px] mt-1 font-medium">Transaksi</span>
                            </button>
                            <button onclick="switchTab('laporan')" id="tab-laporan" class="flex flex-col items-center justify-center flex-1 py-1 text-finTextMuted transition-all">
                                <i class="fa-solid fa-chart-line text-xs"></i>
                                <span class="text-[9px] mt-1 font-medium">Laporan</span>
                            </button>
                            <button onclick="switchTab('budget')" id="tab-budget" class="flex flex-col items-center justify-center flex-1 py-1 text-finTextMuted transition-all">
                                <i class="fa-solid fa-bullseye text-xs"></i>
                                <span class="text-[9px] mt-1 font-medium">Limit</span>
                            </button>
                            <button onclick="switchTab('pengaturan')" id="tab-pengaturan" class="flex flex-col items-center justify-center flex-1 py-1 text-finTextMuted transition-all">
                                <i class="fa-solid fa-sliders text-xs"></i>
                                <span class="text-[9px] mt-1 font-medium">Setelan</span>
                            </button>
                        </div>

                    </div>

                    <!-- CUSTOM ALERT / TOAST SYSTEM -->
                    <div id="toastNotification" class="absolute bottom-20 left-4 right-4 bg-white border border-slate-100 p-3.5 rounded-xl shadow-lg z-50 transform translate-y-24 opacity-0 transition-all duration-300 flex items-center gap-3">
                        <div class="w-8 h-8 rounded-lg bg-emerald-50 flex items-center justify-center text-finGreen" id="toastIcon">
                            <i class="fa-solid fa-bell"></i>
                        </div>
                        <div class="flex-1">
                            <h4 class="text-xs font-bold text-finTextDark" id="toastTitle">Sistem Notifikasi</h4>
                            <p class="text-[10px] text-finTextMuted" id="toastMessage">Operasi berhasil dilaksanakan.</p>
                        </div>
                    </div>

                    <!-- MODAL TRANSAKSI BARU -->
                    <div id="addTransactionModal" class="absolute inset-0 bg-black/30 backdrop-blur-sm z-50 flex items-end justify-center transform translate-y-full transition-all duration-300">
                        <div class="w-full bg-white rounded-t-[28px] p-5 space-y-4 border-t border-slate-100 shadow-2xl">
                            <div class="flex justify-between items-center">
                                <h3 class="text-xs font-black text-finTextDark"><i class="fa-solid fa-plus-circle mr-2 text-finGreen"></i>Catat Transaksi</h3>
                                <button onclick="toggleTransactionModal(false)" class="w-6 h-6 rounded-full bg-slate-100 text-finTextMuted flex items-center justify-center"><i class="fa-solid fa-xmark text-xs"></i></button>
                            </div>
                            
                            <form id="transactionForm" onsubmit="submitTransaction(event)" class="space-y-3 text-[11px]">
                                <div class="grid grid-cols-2 gap-2">
                                    <button type="button" onclick="selectFormType('EXPENSE')" id="formTypeExpense" class="py-2 rounded-lg border border-red-200 bg-red-50 text-dangerRed font-bold transition-all text-center">Pengeluaran</button>
                                    <button type="button" onclick="selectFormType('INCOME')" id="formTypeIncome" class="py-2 rounded-lg border border-slate-100 bg-slate-50 text-finTextMuted font-bold transition-all text-center">Pemasukan</button>
                                </div>

                                <div class="space-y-1">
                                    <label class="text-[9px] text-finTextMuted font-bold">Nominal (Rp)</label>
                                    <input type="number" id="formAmount" required min="1" placeholder="Masukkan Nominal..." class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none focus:border-finGreen">
                                </div>

                                <div class="space-y-1">
                                    <label class="text-[9px] text-finTextMuted font-bold">Kategori</label>
                                    <select id="formCategory" class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none focus:border-finGreen">
                                        <option value="Makan">Makanan & Minuman</option>
                                        <option value="Transportasi">Transportasi & BBM</option>
                                        <option value="Belanja">Belanja Bulanan</option>
                                        <option value="Hiburan">Hiburan & Rekreasi</option>
                                        <option value="Gaji">Gaji Utama</option>
                                        <option value="Bonus">Bonus & Sampingan</option>
                                    </select>
                                </div>

                                <div class="space-y-1">
                                    <label class="text-[9px] text-finTextMuted font-bold">Catatan</label>
                                    <input type="text" id="formNote" placeholder="Tulis catatan (Opsional)..." class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none focus:border-finGreen">
                                </div>

                                <div class="grid grid-cols-2 gap-2">
                                    <div class="space-y-1">
                                        <label class="text-[9px] text-finTextMuted font-bold">Dompet / Rekening</label>
                                        <select id="formWallet" class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none">
                                            <option value="Dompet Tunai">Dompet Tunai</option>
                                            <option value="Bank BCA">Bank BCA</option>
                                            <option value="E-Wallet OVO">E-Wallet OVO</option>
                                        </select>
                                    </div>
                                    <div class="space-y-1">
                                        <label class="text-[9px] text-finTextMuted font-bold">Tag</label>
                                        <select id="formTag" class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none">
                                            <option value="Pribadi">Pribadi</option>
                                            <option value="Keluarga">Keluarga</option>
                                            <option value="Liburan">Liburan</option>
                                            <option value="Bisnis">Bisnis</option>
                                        </select>
                                    </div>
                                </div>

                                <button type="submit" class="w-full py-2.5 rounded-xl bg-finGreen hover:bg-finGreenHover text-white font-bold text-center active:scale-95 transition-all mt-4">Simpan Transaksi</button>
                            </form>
                        </div>
                    </div>

                    <!-- MODAL SET ANGGARAN BARU -->
                    <div id="addBudgetModal" class="absolute inset-0 bg-black/30 backdrop-blur-sm z-50 flex items-end justify-center transform translate-y-full transition-all duration-300">
                        <div class="w-full bg-white rounded-t-[28px] p-5 space-y-4 border-t border-slate-100 shadow-2xl">
                            <div class="flex justify-between items-center">
                                <h3 class="text-xs font-black text-finTextDark"><i class="fa-solid fa-bullseye mr-2 text-finGreen"></i>Atur Limit Anggaran</h3>
                                <button onclick="toggleBudgetModal(false)" class="w-6 h-6 rounded-full bg-slate-100 text-finTextMuted flex items-center justify-center"><i class="fa-solid fa-xmark text-xs"></i></button>
                            </div>
                            
                            <form id="budgetForm" onsubmit="submitBudget(event)" class="space-y-3 text-[11px]">
                                <div class="space-y-1">
                                    <label class="text-[9px] text-finTextMuted font-bold">Kategori Pengeluaran</label>
                                    <select id="budgetCategory" class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none">
                                        <option value="Makan">Makanan & Minuman</option>
                                        <option value="Transportasi">Transportasi & BBM</option>
                                        <option value="Belanja">Belanja Bulanan</option>
                                        <option value="Hiburan">Hiburan & Rekreasi</option>
                                    </select>
                                </div>

                                <div class="space-y-1">
                                    <label class="text-[9px] text-finTextMuted font-bold">Limit Bulanan (Rp)</label>
                                    <input type="number" id="budgetLimit" required min="1" placeholder="Contoh: 1500000" class="w-full bg-slate-50 border border-slate-200 rounded-lg py-2 px-3 text-finTextDark focus:outline-none focus:border-finGreen">
                                </div>

                                <button type="submit" class="w-full py-2.5 rounded-xl bg-finGreen hover:bg-finGreenHover text-white font-bold text-center active:scale-95 transition-all mt-4">Terapkan Limit</button>
                            </form>
                        </div>
                    </div>

                </div>
            </div>
        </div>

    </div>

    <!-- APP LOGIC (JAVASCRIPT) -->
    <script>
        // Minimalist State Data with Beautiful Green accents and clean colors
        let appState = {
            transactions: [
                { id: 1, amount: 4500000, type: 'INCOME', categoryName: 'Gaji', date: '2026-07-01', note: 'Gaji Bulanan', wallet: 'Bank BCA', tag: 'Pribadi' },
                { id: 2, amount: 250000, type: 'EXPENSE', categoryName: 'Makan', date: '2026-07-04', note: 'Makan Siang Tim', wallet: 'Dompet Tunai', tag: 'Bisnis' },
                { id: 3, amount: 120000, type: 'EXPENSE', categoryName: 'Transportasi', date: '2026-07-05', note: 'Pengisian Bensin BBM', wallet: 'Dompet Tunai', tag: 'Pribadi' },
                { id: 4, amount: 350000, type: 'EXPENSE', categoryName: 'Belanja', date: '2026-07-06', note: 'Belanja Mingguan', wallet: 'E-Wallet OVO', tag: 'Keluarga' }
            ],
            budgets: [
                { categoryName: 'Makan', limitAmount: 2000000, spentAmount: 250000 },
                { categoryName: 'Transportasi', limitAmount: 1000000, spentAmount: 120000 },
                { categoryName: 'Belanja', limitAmount: 1500000, spentAmount: 350000 }
            ],
            wallets: [
                { name: 'Dompet Tunai', type: 'Cash', balance: 500000 },
                { name: 'Bank BCA', type: 'BCA', balance: 3500000 },
                { name: 'E-Wallet OVO', type: 'OVO', balance: 180000 }
            ],
            settings: {
                currencySymbol: 'Rp',
                appLanguage: 'ID',
                pinPassword: '1234'
            },
            currentScreen: 'dashboard',
            formType: 'EXPENSE'
        };

        // Load database if existing
        if (localStorage.getItem('smart_finance_light_state')) {
            appState = JSON.parse(localStorage.getItem('smart_finance_light_state'));
        }

        const screenLock = document.getElementById('screenLock');
        const screenApp = document.getElementById('screenApp');
        const appContainer = document.getElementById('appContainer');

        let enteredPin = "";

        // Status bar live time
        function updateClock() {
            const now = new Date();
            const hours = String(now.getHours()).padStart(2, '0');
            const minutes = String(now.getMinutes()).padStart(2, '0');
            document.getElementById('statusBarTime').innerText = `${hours}:${minutes}`;
        }
        setInterval(updateClock, 1000);
        updateClock();

        // Pin Screen Logic
        function pressPin(num) {
            if (enteredPin.length < 4) {
                enteredPin += num;
                updatePinDots();
                logConsole(`[PIN] User entered character: ${num}`);
                if (enteredPin.length === 4) {
                    setTimeout(validatePin, 200);
                }
            }
        }

        function clearPin() {
            if (enteredPin.length > 0) {
                enteredPin = enteredPin.slice(0, -1);
                updatePinDots();
                logConsole(`[PIN] Input deleted character`);
            }
        }

        function updatePinDots() {
            const dots = document.querySelectorAll('.pin-dot');
            dots.forEach((dot, index) => {
                if (index < enteredPin.length) {
                    dot.className = "pin-dot w-3.5 h-3.5 rounded-full bg-finGreen border-2 border-finGreen transition-all duration-200";
                } else {
                    dot.className = "pin-dot w-3.5 h-3.5 rounded-full border-2 border-slate-200 transition-all duration-200";
                }
            });
        }

        function validatePin() {
            if (enteredPin === appState.settings.pinPassword) {
                unlockApp();
            } else {
                showToast("Sandi Salah", "PIN Keamanan tidak cocok.", "dangerRed");
                enteredPin = "";
                updatePinDots();
                logConsole(`[SECURITY] Authentication failure.`);
            }
        }

        function simulateBiometric() {
            logConsole(`[BIOMETRIC] Scanning touch identifier.`);
            unlockApp();
        }

        function unlockApp() {
            screenLock.classList.add('opacity-0', 'pointer-events-none');
            setTimeout(() => {
                screenLock.classList.add('hidden');
                screenApp.classList.remove('hidden');
                logConsole(`[SECURITY] Authenticated. Loading minimal theme components.`);
                showToast("Selamat Datang!", "Profil finansial luring Anda aktif.", "safeGreen");
                renderActiveTab();
            }, 300);
        }

        // Notification Toasts
        function showToast(title, msg, colorType) {
            const toast = document.getElementById('toastNotification');
            const toastIcon = document.getElementById('toastIcon');
            const toastTitle = document.getElementById('toastTitle');
            const toastMessage = document.getElementById('toastMessage');

            toastTitle.innerText = title;
            toastMessage.innerText = msg;

            if (colorType === 'safeGreen') {
                toastIcon.className = "w-8 h-8 rounded-lg bg-emerald-50 flex items-center justify-center text-finGreen";
                toastIcon.innerHTML = `<i class="fa-solid fa-circle-check"></i>`;
            } else if (colorType === 'dangerRed') {
                toastIcon.className = "w-8 h-8 rounded-lg bg-red-50 flex items-center justify-center text-dangerRed";
                toastIcon.innerHTML = `<i class="fa-solid fa-circle-exclamation"></i>`;
            } else {
                toastIcon.className = "w-8 h-8 rounded-lg bg-emerald-50 flex items-center justify-center text-finGreen";
                toastIcon.innerHTML = `<i class="fa-solid fa-bell"></i>`;
            }

            toast.classList.remove('translate-y-24', 'opacity-0');
            setTimeout(() => {
                toast.classList.add('translate-y-24', 'opacity-0');
            }, 3500);
        }

        // Logger Functionality
        function logConsole(text) {
            const logger = document.getElementById('consoleLog');
            const item = document.createElement('div');
            item.innerText = text;
            logger.appendChild(item);
            logger.scrollTop = logger.scrollHeight;
        }

        // Formatting Helpers
        function formatMoney(amount) {
            return appState.settings.currencySymbol + " " + Number(amount).toLocaleString('id-ID');
        }

        // ==========================================
        // SWITCH NAVIGATION TABS
        // ==========================================
        function switchTab(tabId) {
            const tabs = ['dashboard', 'transaksi', 'laporan', 'budget', 'pengaturan'];
            tabs.forEach(t => {
                const btn = document.getElementById(`tab-${t}`);
                btn.className = "flex flex-col items-center justify-center flex-1 py-1 text-finTextMuted transition-all";
            });

            const activeBtn = document.getElementById(`tab-${tabId}`);
            activeBtn.className = "flex flex-col items-center justify-center flex-1 py-1 text-finGreen transition-all";

            appState.currentScreen = tabId;
            renderActiveTab();
            logConsole(`[NAVIGATION] Screen: ${tabId.toUpperCase()}`);
        }

        // Save State Routine
        function saveStateToLocal() {
            localStorage.setItem('smart_finance_light_state', JSON.stringify(appState));
        }

        // Recalculate totals
        function getTotals() {
            let totalIncome = 0;
            let totalExpense = 0;
            appState.transactions.forEach(t => {
                if (t.type === 'INCOME') totalIncome += Number(t.amount);
                else if (t.type === 'EXPENSE') totalExpense += Number(t.amount);
            });

            // Adjust dynamic spent amount
            appState.budgets.forEach(b => {
                b.spentAmount = 0;
                appState.transactions.forEach(t => {
                    if (t.type === 'EXPENSE' && t.categoryName === b.categoryName) {
                        b.spentAmount += Number(t.amount);
                    }
                });
            });

            return {
                income: totalIncome,
                expense: totalExpense,
                balance: totalIncome - totalExpense
            };
        }

        // ==========================================
        // RENDER SCREENS
        // ==========================================
        function renderActiveTab() {
            const totals = getTotals();
            let html = "";

            if (appState.currentScreen === 'dashboard') {
                html = `
                    <!-- Minimal Total Balance Elegant Card -->
                    <div class="rounded-2xl bg-gradient-to-br from-emerald-600 via-emerald-500 to-teal-700 p-5 shadow-sm border border-emerald-500/20 text-white space-y-4">
                        <div>
                            <p class="text-[10px] font-bold tracking-wider text-emerald-100 uppercase">Total Saldo Bersih</p>
                            <h2 class="text-2xl font-black mt-1">${formatMoney(totals.balance)}</h2>
                        </div>
                        <div class="grid grid-cols-2 gap-4 pt-3 border-t border-emerald-400/30">
                            <div>
                                <span class="text-[9px] text-emerald-100 flex items-center gap-1"><i class="fa-solid fa-circle text-white text-[5px]"></i> Pemasukan</span>
                                <p class="text-xs font-bold">${formatMoney(totals.income)}</p>
                            </div>
                            <div>
                                <span class="text-[9px] text-emerald-100 flex items-center gap-1"><i class="fa-solid fa-circle text-white text-[5px]"></i> Pengeluaran</span>
                                <p class="text-xs font-bold">${formatMoney(totals.expense)}</p>
                            </div>
                        </div>
                    </div>

                    <!-- Flow Analysis Mini-Chart -->
                    <div class="bg-white border border-slate-100 p-4 rounded-2xl soft-shadow space-y-3">
                        <h4 class="text-[11px] font-extrabold text-finTextDark flex justify-between">
                            <span>ARUS KAS BULAN INI</span>
                            <span class="text-finGreen text-[9px] font-medium"><i class="fa-solid fa-seedling mr-1"></i>Real-time</span>
                        </h4>
                        <canvas id="miniFlowChart" class="w-full h-20 bg-slate-50 rounded-xl"></canvas>
                    </div>

                    <!-- Header Title for Recents -->
                    <div class="flex justify-between items-center pt-1">
                        <h4 class="text-[11px] font-bold text-finTextDark uppercase tracking-wider">Transaksi Terbaru</h4>
                        <button onclick="switchTab('transaksi')" class="text-[10px] text-finGreen font-semibold hover:underline">Lihat Semua</button>
                    </div>

                    <!-- List container -->
                    <div class="space-y-2 pb-4">
                        ${renderTransactionsList(3)}
                    </div>
                `;
                appContainer.innerHTML = html;
                drawMiniFlowChart();

            } else if (appState.currentScreen === 'transaksi') {
                html = `
                    <div class="flex justify-between items-center">
                        <h4 class="text-xs font-bold text-finTextDark uppercase tracking-wider">Arsip Keuangan</h4>
                        <button onclick="toggleTransactionModal(true)" class="px-3 py-1.5 rounded-xl bg-finGreen hover:bg-finGreenHover text-white text-[10px] font-bold flex items-center gap-1 active:scale-95 transition-all shadow-sm">
                            <i class="fa-solid fa-plus text-[8px]"></i> Transaksi
                        </button>
                    </div>

                    <div class="relative">
                        <input type="text" id="trxSearchInput" oninput="filterTransactions()" placeholder="Cari nominal, catatan, kategori..." class="w-full bg-slate-50 border border-slate-200 rounded-xl py-2 pl-9 pr-4 text-xs text-finTextDark focus:outline-none focus:border-finGreen">
                        <i class="fa-solid fa-magnifying-glass text-finTextMuted absolute left-3.5 top-2.5 text-[10px]"></i>
                    </div>

                    <div class="space-y-2 pb-4" id="transactionsContainer">
                        ${renderTransactionsList()}
                    </div>
                `;
                appContainer.innerHTML = html;

            } else if (appState.currentScreen === 'laporan') {
                html = `
                    <h4 class="text-xs font-bold text-finTextDark uppercase tracking-wider">Analisis Laporan</h4>
                    
                    <!-- Chart Selector Segmented Buttons -->
                    <div class="grid grid-cols-2 gap-1 bg-slate-100 p-1 rounded-xl border border-slate-200/50">
                        <button onclick="drawReportChart('PIE')" id="btnChartPie" class="py-1 rounded-lg text-[10px] font-bold bg-white text-finGreen shadow-sm transition-all">Proporsi Kategori</button>
                        <button onclick="drawReportChart('BAR')" id="btnChartBar" class="py-1 rounded-lg text-[10px] font-bold text-finTextMuted hover:bg-white/50 transition-all">Arus Bulanan</button>
                    </div>

                    <!-- Minimal Premium Graphic Container -->
                    <div class="bg-white border border-slate-100 p-4 rounded-2xl soft-shadow flex flex-col items-center justify-center space-y-4">
                        <h5 class="text-[10px] font-bold text-finTextDark uppercase self-start tracking-wider" id="chartTitle">Pie Chart Kategori</h5>
                        <canvas id="interactiveCanvas" class="w-44 h-44 bg-transparent" width="180" height="180"></canvas>
                        <div id="chartLegend" class="grid grid-cols-2 gap-2 text-[9px] w-full pt-2 border-t border-slate-100"></div>
                    </div>

                    <!-- Minimalist Export Panel -->
                    <div class="bg-white border border-slate-100 p-4 rounded-2xl soft-shadow space-y-3">
                        <h5 class="text-[10px] font-bold text-finTextDark uppercase tracking-wider">Ekspor Data & Berkas</h5>
                        <div class="grid grid-cols-3 gap-2">
                            <button onclick="simulateExport('PDF')" class="py-2 rounded-xl bg-slate-50 border border-slate-100 text-dangerRed font-bold text-[9px] flex flex-col items-center gap-1 active:scale-95 transition-all">
                                <i class="fa-solid fa-file-pdf text-base"></i> Dokumen PDF
                            </button>
                            <button onclick="simulateExport('Excel')" class="py-2 rounded-xl bg-slate-50 border border-slate-100 text-emerald-600 font-bold text-[9px] flex flex-col items-center gap-1 active:scale-95 transition-all">
                                <i class="fa-solid fa-file-excel text-base"></i> Sheet Excel
                            </button>
                            <button onclick="simulateExport('CSV')" class="py-2 rounded-xl bg-slate-50 border border-slate-100 text-blue-600 font-bold text-[9px] flex flex-col items-center gap-1 active:scale-95 transition-all">
                                <i class="fa-solid fa-file-csv text-base"></i> Berkas CSV
                            </button>
                        </div>
                    </div>
                `;
                appContainer.innerHTML = html;
                drawReportChart('PIE');

            } else if (appState.currentScreen === 'budget') {
                html = `
                    <div class="flex justify-between items-center">
                        <h4 class="text-xs font-bold text-finTextDark uppercase tracking-wider">Target Pengeluaran</h4>
                        <button onclick="toggleBudgetModal(true)" class="px-3 py-1.5 rounded-xl bg-finGreen hover:bg-finGreenHover text-white text-[10px] font-bold flex items-center gap-1 active:scale-95 transition-all shadow-sm">
                            <i class="fa-solid fa-circle-plus text-[8px]"></i> Set Limit
                        </button>
                    </div>

                    <div class="space-y-3 pb-4">
                        ${renderBudgetProgressList()}
                    </div>
                `;
                appContainer.innerHTML = html;

            } else if (appState.currentScreen === 'pengaturan') {
                html = `
                    <h4 class="text-xs font-bold text-finTextDark uppercase tracking-wider">Setelan Akun</h4>

                    <!-- Language settings & Minimal currency toggler -->
                    <div class="bg-white border border-slate-100 p-4 rounded-2xl soft-shadow space-y-4">
                        <div class="flex justify-between items-center text-xs">
                            <span class="font-bold text-finTextDark flex items-center gap-2">
                                <i class="fa-solid fa-coins text-finGreen text-sm"></i> Simbol Mata Uang
                            </span>
                            <div class="flex bg-slate-100 p-0.5 rounded-lg border border-slate-200">
                                <button onclick="changeCurrency('Rp')" class="px-2.5 py-0.5 rounded-md text-[10px] font-black ${appState.settings.currencySymbol === 'Rp' ? 'bg-white text-finGreen shadow-sm' : 'text-finTextMuted'}">Rp</button>
                                <button onclick="changeCurrency('$')" class="px-2.5 py-0.5 rounded-md text-[10px] font-black ${appState.settings.currencySymbol === '$' ? 'bg-white text-finGreen shadow-sm' : 'text-finTextMuted'}">$</button>
                                <button onclick="changeCurrency('€')" class="px-2.5 py-0.5 rounded-md text-[10px] font-black ${appState.settings.currencySymbol === '€' ? 'bg-white text-finGreen shadow-sm' : 'text-finTextMuted'}">€</button>
                            </div>
                        </div>

                        <div class="border-t border-slate-100 pt-3 flex justify-between items-center text-xs">
                            <span class="font-bold text-finTextDark flex items-center gap-2">
                                <i class="fa-solid fa-fingerprint text-finGreen text-sm"></i> Fingerprint Login
                            </span>
                            <label class="relative inline-flex items-center cursor-pointer">
                                <input type="checkbox" checked class="sr-only peer" disabled>
                                <div class="w-9 h-5 bg-slate-200 rounded-full peer peer-checked:bg-finGreen after:content-[''] after:absolute after:top-0.5 after:left-[2px] after:bg-white after:rounded-full after:h-4 after:w-4 after:transition-all peer-checked:after:translate-x-full"></div>
                            </label>
                        </div>
                    </div>

                    <!-- Database backup and recovery -->
                    <div class="bg-white border border-slate-100 p-4 rounded-2xl soft-shadow space-y-3">
                        <span class="text-xs font-bold text-finTextDark flex items-center gap-2">
                            <i class="fa-solid fa-database text-finGreen text-sm"></i> Pengelolaan Basis Data
                        </span>
                        <div class="grid grid-cols-2 gap-2 text-[10px]">
                            <button onclick="triggerAppBackup()" class="py-2 px-3 bg-slate-50 hover:bg-slate-100 border border-slate-100 text-finGreen rounded-xl font-bold flex items-center justify-center gap-1.5 active:scale-95 transition-all">
                                <i class="fa-solid fa-cloud-arrow-up"></i> Backup DB
                            </button>
                            <button onclick="triggerAppRestore()" class="py-2 px-3 bg-slate-50 hover:bg-slate-100 border border-slate-100 text-finGreen rounded-xl font-bold flex items-center justify-center gap-1.5 active:scale-95 transition-all">
                                <i class="fa-solid fa-arrows-rotate"></i> Restore DB
                            </button>
                        </div>
                    </div>

                    <button onclick="logoutApp()" class="w-full py-2.5 bg-red-50 text-dangerRed border border-red-100 hover:bg-red-100 rounded-xl font-bold text-xs active:scale-95 transition-all mt-2">
                        <i class="fa-solid fa-lock mr-1.5"></i> Amankan & Kunci Sesi
                    </button>
                `;
                appContainer.innerHTML = html;
            }
        }

        // ==========================================
        // SUB RENDERING UTILITIES
        // ==========================================
        function renderTransactionsList(limit = null, listToRender = null) {
            const trxs = listToRender || appState.transactions;
            const items = limit ? trxs.slice(0, limit) : trxs;

            if (items.length === 0) {
                return `<div class="text-center py-6 text-[11px] text-finTextMuted">Belum ada mutasi keuangan tercatat.</div>`;
            }

            // Minimal card rows with clean white backgrounds and thin borders
            return items.map(t => `
                <div class="p-3 bg-white rounded-xl border border-slate-100 flex items-center justify-between hover:border-emerald-100 transition-all">
                    <div class="flex items-center gap-3">
                        <div class="w-9 h-9 rounded-xl ${t.type === 'INCOME' ? 'bg-emerald-50 text-finGreen' : 'bg-red-50 text-dangerRed'} flex items-center justify-center text-xs">
                            <i class="${t.type === 'INCOME' ? 'fa-solid fa-arrow-trend-up' : 'fa-solid fa-arrow-trend-down'}"></i>
                        </div>
                        <div>
                            <h5 class="text-xs font-bold text-finTextDark leading-tight">${t.categoryName}</h5>
                            <p class="text-[9px] text-finTextMuted mt-0.5 leading-none max-w-[130px] truncate">${t.note || 'Tanpa Catatan'}</p>
                            <div class="flex gap-1.5 mt-1.5">
                                <span class="inline-block text-[8px] bg-slate-50 text-finTextMuted border border-slate-100 px-1.5 py-0.5 rounded-md font-medium"><i class="fa-solid fa-credit-card mr-1 text-[7px]"></i>${t.wallet}</span>
                                <span class="inline-block text-[8px] bg-emerald-50/50 text-finGreen border border-emerald-100 px-1.5 py-0.5 rounded-md font-medium"><i class="fa-solid fa-tag mr-1 text-[7px]"></i>${t.tag}</span>
                            </div>
                        </div>
                    </div>
                    <div class="text-right flex flex-col justify-between items-end">
                        <span class="text-xs font-black ${t.type === 'INCOME' ? 'text-finGreen' : 'text-dangerRed'}">${t.type === 'INCOME' ? '+' : '-'}${formatMoney(t.amount)}</span>
                        <span class="text-[8px] text-finTextMuted mt-1">${t.date}</span>
                        <button onclick="deleteTransaction(${t.id})" class="text-[9px] text-slate-300 hover:text-dangerRed mt-1 transition-all"><i class="fa-regular fa-trash-can"></i></button>
                    </div>
                </div>
            `).join('');
        }

        function filterTransactions() {
            const query = document.getElementById('trxSearchInput').value.toLowerCase();
            const container = document.getElementById('transactionsContainer');
            
            const filtered = appState.transactions.filter(t => {
                return t.categoryName.toLowerCase().includes(query) || 
                       (t.note && t.note.toLowerCase().includes(query)) ||
                       t.amount.toString().includes(query);
            });

            container.innerHTML = renderTransactionsList(null, filtered);
        }

        function renderBudgetProgressList() {
            if (appState.budgets.length === 0) {
                return `<div class="text-center py-6 text-xs text-finTextMuted">Belum ada target diatur.</div>`;
            }

            return appState.budgets.map(b => {
                const ratio = b.limitAmount > 0 ? (b.spentAmount / b.limitAmount) : 0;
                const percent = Math.min(Math.round(ratio * 100), 100);
                const isOverLimit = ratio >= 1.0;
                const isAlmostLimit = ratio >= 0.85;

                return `
                    <div class="bg-white border border-slate-100 p-4 rounded-xl space-y-2.5">
                        <div class="flex justify-between items-center text-xs">
                            <span class="font-extrabold text-finTextDark flex items-center gap-1.5">
                                <i class="fa-solid fa-bullseye text-finGreen text-[11px]"></i> ${b.categoryName}
                            </span>
                            ${isAlmostLimit ? `
                                <span class="px-2 py-0.5 rounded bg-red-50 text-dangerRed font-black text-[7px] tracking-wider uppercase animate-pulse">
                                    ${isOverLimit ? 'Batas Terlampaui' : 'Hampir Habis'}
                                </span>
                            ` : ''}
                        </div>

                        <!-- Minimal progress bar track -->
                        <div class="w-full h-1.5 rounded-full bg-slate-100 overflow-hidden">
                            <div class="h-full rounded-full transition-all duration-500 ${isAlmostLimit ? 'bg-dangerRed' : 'bg-finGreen'}" style="width: ${percent}%"></div>
                        </div>

                        <div class="flex justify-between items-center text-[9px] text-finTextMuted">
                            <span>Terpakai: <strong class="text-finTextDark">${formatMoney(b.spentAmount)}</strong></span>
                            <span>Limit: <strong class="text-finTextDark">${formatMoney(b.limitAmount)}</strong></span>
                        </div>
                    </div>
                `;
            }).join('');
        }

        // ==========================================
        // ADD TRANSACTION CONTROLLER
        // ==========================================
        function toggleTransactionModal(show) {
            const m = document.getElementById('addTransactionModal');
            if (show) {
                m.classList.remove('translate-y-full');
            } else {
                m.classList.add('translate-y-full');
            }
        }

        function selectFormType(type) {
            appState.formType = type;
            const btnExpense = document.getElementById('formTypeExpense');
            const btnIncome = document.getElementById('formTypeIncome');

            if (type === 'EXPENSE') {
                btnExpense.className = "py-2 rounded-lg border border-red-200 bg-red-50 text-dangerRed font-bold transition-all text-center";
                btnIncome.className = "py-2 rounded-lg border border-slate-100 bg-slate-50 text-finTextMuted font-bold transition-all text-center";
            } else {
                btnExpense.className = "py-2 rounded-lg border border-slate-100 bg-slate-50 text-finTextMuted font-bold transition-all text-center";
                btnIncome.className = "py-2 rounded-lg border border-emerald-200 bg-emerald-50 text-finGreen font-bold transition-all text-center";
            }
        }

        function submitTransaction(event) {
            event.preventDefault();

            const amount = document.getElementById('formAmount').value;
            const category = document.getElementById('formCategory').value;
            const note = document.getElementById('formNote').value;
            const wallet = document.getElementById('formWallet').value;
            const tag = document.getElementById('formTag').value;

            if (amount <= 0) {
                showToast("Nominal Negatif", "Input transaksi harus positif.", "dangerRed");
                return;
            }

            const todayStr = new Date().toISOString().split('T')[0];

            const newTrx = {
                id: Date.now(),
                amount: Number(amount),
                type: appState.formType,
                categoryName: category,
                date: todayStr,
                note: note,
                wallet: wallet,
                tag: tag
            };

            appState.transactions.unshift(newTrx);
            saveStateToLocal();
            
            toggleTransactionModal(false);
            
            // Checking limits
            const totals = getTotals();
            const relevantBudget = appState.budgets.find(b => b.categoryName === category);
            if (relevantBudget && relevantBudget.spentAmount >= relevantBudget.limitAmount * 0.85) {
                showToast("Peringatan Batas!", `Anggaran ${category} hampir terlampaui!`, "dangerRed");
            } else {
                showToast("Berhasil Disimpan", `Transaksi ${category} ditambahkan ke database.`, "safeGreen");
            }

            renderActiveTab();
            logConsole(`[ROOM_DB] Row added: ${category} -> ${formatMoney(amount)}`);
            
            // Reset fields
            document.getElementById('transactionForm').reset();
        }

        function deleteTransaction(id) {
            appState.transactions = appState.transactions.filter(t => t.id !== id);
            saveStateToLocal();
            renderActiveTab();
            showToast("Transaksi Terhapus", "Entri transaksi berhasil dihapus.", "safeGreen");
            logConsole(`[ROOM_DB] Removed transaction ID ${id}`);
        }

        // ==========================================
        // BUDGET LIMIT CONTROLLER
        // ==========================================
        function toggleBudgetModal(show) {
            const m = document.getElementById('addBudgetModal');
            if (show) {
                m.classList.remove('translate-y-full');
            } else {
                m.classList.add('translate-y-full');
            }
        }

        function submitBudget(event) {
            event.preventDefault();
            const cat = document.getElementById('budgetCategory').value;
            const limit = document.getElementById('budgetLimit').value;

            const existing = appState.budgets.find(b => b.categoryName === cat);
            if (existing) {
                existing.limitAmount = Number(limit);
            } else {
                appState.budgets.push({ categoryName: cat, limitAmount: Number(limit), spentAmount: 0 });
            }

            saveStateToLocal();
            toggleBudgetModal(false);
            showToast("Limit Disetel", `Batas baru kategori ${cat} berhasil diperbarui.`, "safeGreen");
            renderActiveTab();
            logConsole(`[ROOM_DB] Updated Budget configuration row.`);
        }

        // ==========================================
        // GRAPHICS DRAWING LOGIC (CANVAS API)
        // ==========================================
        function drawMiniFlowChart() {
            const canvas = document.getElementById('miniFlowChart');
            if (!canvas) return;
            const ctx = canvas.getContext('2d');
            
            const dpr = window.devicePixelRatio || 1;
            canvas.width = canvas.getBoundingClientRect().width * dpr;
            canvas.height = canvas.getBoundingClientRect().height * dpr;
            ctx.scale(dpr, dpr);

            const w = canvas.getBoundingClientRect().width;
            const h = canvas.getBoundingClientRect().height;

            ctx.clearRect(0, 0, w, h);

            // Subtle minimalist grid lines
            ctx.strokeStyle = "rgba(0, 0, 0, 0.02)";
            ctx.lineWidth = 1;
            for (let i = 0; i < 4; i++) {
                const y = (h / 3) * i;
                ctx.beginPath();
                ctx.moveTo(0, y);
                ctx.lineTo(w, y);
                ctx.stroke();
            }

            // Smooth finance green vector flow (bezier curve)
            ctx.strokeStyle = "#10B981"; 
            ctx.lineWidth = 2.5;
            ctx.beginPath();
            ctx.moveTo(0, h * 0.7);
            ctx.bezierCurveTo(w * 0.25, h * 0.15, w * 0.5, h * 0.65, w, h * 0.25);
            ctx.stroke();

            // Underlay gradient
            const gradient = ctx.createLinearGradient(0, 0, 0, h);
            gradient.addColorStop(0, 'rgba(16, 185, 129, 0.1)');
            gradient.addColorStop(1, 'rgba(16, 185, 129, 0)');
            ctx.fillStyle = gradient;
            ctx.lineTo(w, h);
            ctx.lineTo(0, h);
            ctx.fill();
        }

        function drawReportChart(type) {
            const btnPie = document.getElementById('btnChartPie');
            const btnBar = document.getElementById('btnChartBar');
            const title = document.getElementById('chartTitle');

            if (type === 'PIE') {
                btnPie.className = "py-1 rounded-lg text-[10px] font-bold bg-white text-finGreen shadow-sm transition-all";
                btnBar.className = "py-1 rounded-lg text-[10px] font-bold text-finTextMuted hover:bg-white/50 transition-all";
                title.innerText = "Proporsi Kategori Pengeluaran";
                setTimeout(drawInteractivePie, 100);
            } else {
                btnPie.className = "py-1 rounded-lg text-[10px] font-bold text-finTextMuted hover:bg-white/50 transition-all";
                btnBar.className = "py-1 rounded-lg text-[10px] font-bold bg-white text-finGreen shadow-sm transition-all";
                title.innerText = "Arus Pengeluaran Bulanan";
                setTimeout(drawInteractiveBar, 100);
            }
        }

        function drawInteractivePie() {
            const canvas = document.getElementById('interactiveCanvas');
            if (!canvas) return;
            const ctx = canvas.getContext('2d');
            const cx = canvas.width / 2;
            const cy = canvas.height / 2;
            const radius = 70;

            ctx.clearRect(0, 0, canvas.width, canvas.height);

            const map = {};
            let totalExpense = 0;
            appState.transactions.forEach(t => {
                if (t.type === 'EXPENSE') {
                    map[t.categoryName] = (map[t.categoryName] || 0) + Number(t.amount);
                    totalExpense += Number(t.amount);
                }
            });

            const categories = Object.keys(map);
            if (categories.length === 0) {
                ctx.fillStyle = "#64748B";
                ctx.font = "10px sans-serif";
                ctx.textAlign = "center";
                ctx.fillText("Tidak ada transaksi pengeluaran.", cx, cy);
                return;
            }

            // Fresh minimalist shades of emerald/mint greens + slate
            const colors = ['#10B981', '#059669', '#34D399', '#A7F3D0', '#64748B', '#94A3B8'];
            let startAngle = 0;

            categories.forEach((cat, index) => {
                const value = map[cat];
                const sliceAngle = (value / totalExpense) * (2 * Math.PI);
                const color = colors[index % colors.length];

                ctx.fillStyle = color;
                ctx.beginPath();
                ctx.moveTo(cx, cy);
                ctx.arc(cx, cy, radius, startAngle, startAngle + sliceAngle);
                ctx.closePath();
                ctx.fill();

                startAngle += sliceAngle;
            });

            // Middle white cutout for premium Donut Chart feel
            ctx.fillStyle = "#FFFFFF"; 
            ctx.beginPath();
            ctx.arc(cx, cy, 45, 0, 2 * Math.PI);
            ctx.closePath();
            ctx.fill();

            // Legend renderer with responsive items
            const legend = document.getElementById('chartLegend');
            legend.innerHTML = categories.map((cat, index) => `
                <div class="flex items-center gap-1.5">
                    <span class="w-2.5 h-2.5 rounded-full inline-block" style="background-color: ${colors[index % colors.length]}"></span>
                    <span class="text-finTextDark font-semibold">${cat} (${Math.round((map[cat]/totalExpense)*100)}%)</span>
                </div>
            `).join('');
        }

        function drawInteractiveBar() {
            const canvas = document.getElementById('interactiveCanvas');
            if (!canvas) return;
            const ctx = canvas.getContext('2d');
            ctx.clearRect(0, 0, canvas.width, canvas.height);

            const w = canvas.width;
            const h = canvas.height;
            const barWidth = 16;
            const spacing = 14;

            const data = [1400000, 950000, 2100000, 1600000, 1850000];
            const labels = ['Mar', 'Apr', 'Mei', 'Jun', 'Jul'];
            const maxVal = Math.max(...data);

            // X Axis line
            ctx.strokeStyle = "#E2E8F0";
            ctx.beginPath();
            ctx.moveTo(20, h - 25);
            ctx.lineTo(w - 10, h - 25);
            ctx.stroke();

            data.forEach((val, index) => {
                const barHeight = ((val / maxVal) * (h - 50));
                const x = 30 + (barWidth + spacing) * index;
                const y = h - 25 - barHeight;

                // Finance Green primary color
                ctx.fillStyle = "#10B981";
                ctx.beginPath();
                ctx.roundRect(x, y, barWidth, barHeight, [4, 4, 0, 0]);
                ctx.fill();

                // Typography label
                ctx.fillStyle = "#64748B";
                ctx.font = "8px sans-serif";
                ctx.textAlign = "center";
                ctx.fillText(labels[index], x + barWidth/2, h - 12);
            });

            document.getElementById('chartLegend').innerHTML = `
                <div class="col-span-2 text-center text-finTextMuted text-[8px] leading-tight">
                    Data diambil otomatis dari agregat historis Room DB lokal.
                </div>
            `;
        }

        // ==========================================
        // SETTINGS & ACTIONS
        // ==========================================
        function changeCurrency(symbol) {
            appState.settings.currencySymbol = symbol;
            saveStateToLocal();
            
            showToast("Sandi Diperbarui", `Mata uang utama diubah ke ${symbol}`, "safeGreen");
            renderActiveTab();
            logConsole(`[DATASTORE] Configuration changed: ${symbol}`);
        }

        function triggerAppBackup() {
            logConsole(`[SYSTEM] Syncing local Room schema snapshot to internal storage...`);
            setTimeout(() => {
                showToast("Ekspor Sukses", "Salinan smart_finance.db siap dibagikan.", "safeGreen");
                logConsole(`[SYSTEM] Encrypted database backup created (1.2 MB).`);
            }, 800);
        }

        function triggerAppRestore() {
            logConsole(`[SYSTEM] Connecting to localized backup nodes...`);
            setTimeout(() => {
                showToast("Restore Berhasil", "Data berhasil disinkronisasi ke status awal.", "safeGreen");
                logConsole(`[SYSTEM] Loaded transactions & limits states.`);
                renderActiveTab();
            }, 1000);
        }

        function logoutApp() {
            enteredPin = "";
            updatePinDots();
            screenApp.classList.add('hidden');
            screenLock.classList.remove('hidden', 'opacity-0', 'pointer-events-none');
            showToast("Akses Terkunci", "Sesi ditutup demi keamanan finansial.", "dangerRed");
            logConsole(`[SECURITY] Core lock engaged. Sesi diamankan.`);
        }

        function simulateExport(format) {
            logConsole(`[EXPORTER] Compiling transactional data into ${format} format...`);
            setTimeout(() => {
                showToast("Berkas Siap", `Laporan format ${format} telah disimpan di folder unduhan.`, "safeGreen");
                logConsole(`[EXPORTER] Content shared via local Provider URI.`);
            }, 700);
        }

    </script>
</body>
</html>
