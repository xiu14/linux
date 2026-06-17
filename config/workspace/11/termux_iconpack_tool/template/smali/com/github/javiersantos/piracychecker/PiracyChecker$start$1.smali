.class public final Lcom/github/javiersantos/piracychecker/PiracyChecker$start$1;
.super Lcom/github/javiersantos/piracychecker/callbacks/PiracyCheckerCallback;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final synthetic a:Lcom/github/javiersantos/piracychecker/PiracyChecker;


# direct methods
.method public constructor <init>(Lcom/github/javiersantos/piracychecker/PiracyChecker;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker$start$1;->a:Lcom/github/javiersantos/piracychecker/PiracyChecker;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/github/javiersantos/piracychecker/callbacks/PiracyCheckerCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method


# virtual methods
.method public final allow()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final doNotAllow(Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;Lcom/github/javiersantos/piracychecker/enums/PirateApp;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker$start$1;->a:Lcom/github/javiersantos/piracychecker/PiracyChecker;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/appcompat/app/b;->v(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 22
    .line 23
    const-string p2, "null cannot be cast to non-null type android.app.Activity"

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    const-string v2, ""

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    iget-object p1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    sget v4, Lcom/github/javiersantos/piracychecker/R$string;->unauthorized_app_found:I

    .line 40
    .line 41
    iget-object p2, p2, Lcom/github/javiersantos/piracychecker/enums/PirateApp;->a:Ljava/lang/String;

    .line 42
    .line 43
    const/4 v5, 0x1

    .line 44
    new-array v5, v5, [Ljava/lang/Object;

    .line 45
    .line 46
    aput-object p2, v5, v1

    .line 47
    .line 48
    invoke-virtual {p1, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object p1, v3

    .line 54
    :goto_0
    if-eqz p1, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object p1, v2

    .line 58
    goto :goto_2

    .line 59
    :cond_4
    sget-object p2, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->m:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 60
    .line 61
    if-ne p1, p2, :cond_6

    .line 62
    .line 63
    iget-object p1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 64
    .line 65
    if-eqz p1, :cond_5

    .line 66
    .line 67
    sget p2, Lcom/github/javiersantos/piracychecker/R$string;->unauthorized_app_blocked:I

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_1

    .line 74
    :cond_5
    move-object p1, v3

    .line 75
    :goto_1
    if-eqz p1, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_6
    iget-object p1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->s:Ljava/lang/String;

    .line 79
    .line 80
    :goto_2
    iget-object p2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->a:Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 81
    .line 82
    sget-object v4, Lcom/github/javiersantos/piracychecker/enums/Display;->h:Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 83
    .line 84
    if-ne p2, v4, :cond_c

    .line 85
    .line 86
    iget-object p2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->p:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 87
    .line 88
    if-eqz p2, :cond_7

    .line 89
    .line 90
    invoke-virtual {p2}, Landroidx/fragment/app/y;->dismiss()V

    .line 91
    .line 92
    .line 93
    :cond_7
    iput-object v3, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->p:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 94
    .line 95
    sget-object p2, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->k:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog$Companion;

    .line 96
    .line 97
    iget-object v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->r:Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v1, :cond_8

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_8
    move-object v1, v2

    .line 103
    :goto_3
    if-eqz p1, :cond_9

    .line 104
    .line 105
    move-object v2, p1

    .line 106
    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance p1, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 110
    .line 111
    invoke-direct {p1}, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;-><init>()V

    .line 112
    .line 113
    .line 114
    sput-object p1, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->h:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 115
    .line 116
    sput-object v1, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->i:Ljava/lang/String;

    .line 117
    .line 118
    sput-object v2, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->j:Ljava/lang/String;

    .line 119
    .line 120
    sget-object p1, Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;->h:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 121
    .line 122
    iput-object p1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->p:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 123
    .line 124
    iget-object p2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 125
    .line 126
    if-eqz p2, :cond_b

    .line 127
    .line 128
    if-eqz p1, :cond_a

    .line 129
    .line 130
    if-eqz p1, :cond_b

    .line 131
    .line 132
    invoke-virtual {p2}, Landroidx/fragment/app/q0;->getSupportFragmentManager()Landroidx/fragment/app/j1;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    const-string v0, "[LICENSE_DIALOG]"

    .line 137
    .line 138
    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/j1;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_a
    sget-object p1, Lcom/github/javiersantos/piracychecker/PiracyChecker$start$1$doNotAllow$1$1;->h:Lcom/github/javiersantos/piracychecker/PiracyChecker$start$1$doNotAllow$1$1;

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/github/javiersantos/piracychecker/PiracyChecker$start$1$doNotAllow$1$1;->invoke()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    :cond_b
    :goto_4
    return-void

    .line 148
    :cond_c
    new-instance p2, Landroid/content/Intent;

    .line 149
    .line 150
    iget-object v2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 151
    .line 152
    const-class v4, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;

    .line 153
    .line 154
    invoke-direct {p2, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 155
    .line 156
    .line 157
    const-string v2, "content"

    .line 158
    .line 159
    invoke-virtual {p2, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    const-string p2, "colorPrimary"

    .line 164
    .line 165
    iget v2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->b:I

    .line 166
    .line 167
    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    const-string p2, "colorPrimaryDark"

    .line 172
    .line 173
    iget v2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->c:I

    .line 174
    .line 175
    invoke-virtual {p1, p2, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    const-string p2, "withLightStatusBar"

    .line 180
    .line 181
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    const-string p2, "layoutXML"

    .line 186
    .line 187
    iget v1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->d:I

    .line 188
    .line 189
    invoke-virtual {p1, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    const-string p2, "Intent(context, LicenseA\u2026a(\"layoutXML\", layoutXML)"

    .line 194
    .line 195
    invoke-static {p1, p2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iget-object p2, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 199
    .line 200
    if-eqz p2, :cond_d

    .line 201
    .line 202
    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 203
    .line 204
    .line 205
    :cond_d
    iget-object p1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 206
    .line 207
    invoke-static {p1}, Landroidx/appcompat/app/b;->v(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result p2

    .line 211
    if-nez p2, :cond_e

    .line 212
    .line 213
    move-object p1, v3

    .line 214
    :cond_e
    if-eqz p1, :cond_f

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 217
    .line 218
    .line 219
    :cond_f
    iget-object p1, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->p:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 220
    .line 221
    if-eqz p1, :cond_10

    .line 222
    .line 223
    invoke-virtual {p1}, Landroidx/fragment/app/y;->dismiss()V

    .line 224
    .line 225
    .line 226
    :cond_10
    iput-object v3, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->p:Lcom/github/javiersantos/piracychecker/PiracyCheckerDialog;

    .line 227
    .line 228
    invoke-virtual {v0}, Lcom/github/javiersantos/piracychecker/PiracyChecker;->a()V

    .line 229
    .line 230
    .line 231
    iput-object v3, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->q:Ldev/jahir/frames/ui/activities/base/BaseLicenseCheckerActivity;

    .line 232
    .line 233
    return-void
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method
