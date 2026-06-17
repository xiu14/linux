.class public Lcom/google/android/material/snackbar/Snackbar;
.super Lcom/google/android/material/snackbar/BaseTransientBottomBar;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/snackbar/Snackbar$SnackbarLayout;,
        Lcom/google/android/material/snackbar/Snackbar$Callback;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/snackbar/BaseTransientBottomBar<",
        "Lcom/google/android/material/snackbar/Snackbar;",
        ">;"
    }
.end annotation


# static fields
.field public static final E:[I


# instance fields
.field public final C:Landroid/view/accessibility/AccessibilityManager;

.field public D:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Lcom/google/android/material/R$attr;->snackbarButtonStyle:I

    .line 2
    .line 3
    sget v1, Lcom/google/android/material/R$attr;->snackbarTextViewStyle:I

    .line 4
    .line 5
    filled-new-array {v0, v1}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/google/android/material/snackbar/Snackbar;->E:[I

    .line 10
    .line 11
    return-void
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

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/android/material/snackbar/SnackbarContentLayout;Lcom/google/android/material/snackbar/SnackbarContentLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/ContentViewCallback;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "accessibility"

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/material/snackbar/Snackbar;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 17
    .line 18
    return-void
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
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
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
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b(I)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final j(ILandroid/view/View$OnClickListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->h:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:Lcom/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->getActionView()Landroid/widget/Button;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    iput-boolean v2, p0, Lcom/google/android/material/snackbar/Snackbar;->D:Z

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Lcom/google/android/material/snackbar/a;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {p1, v1, p0, p2}, Lcom/google/android/material/snackbar/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const/16 p1, 0x8

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 52
    .line 53
    .line 54
    iput-boolean v1, p0, Lcom/google/android/material/snackbar/Snackbar;->D:Z

    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method

.method public final k()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/google/android/material/snackbar/SnackbarManager;->b()Lcom/google/android/material/snackbar/SnackbarManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/snackbar/Snackbar;->C:Landroid/view/accessibility/AccessibilityManager;

    .line 6
    .line 7
    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x4

    .line 11
    const/4 v5, -0x2

    .line 12
    if-ne v2, v5, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v7, 0x1d

    .line 18
    .line 19
    if-lt v6, v7, :cond_2

    .line 20
    .line 21
    iget-boolean v5, p0, Lcom/google/android/material/snackbar/Snackbar;->D:Z

    .line 22
    .line 23
    if-eqz v5, :cond_1

    .line 24
    .line 25
    const/4 v5, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v5, 0x0

    .line 28
    :goto_0
    or-int/lit8 v5, v5, 0x3

    .line 29
    .line 30
    invoke-static {v1, v2, v5}, La4/a;->c(Landroid/view/accessibility/AccessibilityManager;II)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    iget-boolean v6, p0, Lcom/google/android/material/snackbar/Snackbar;->D:Z

    .line 36
    .line 37
    if-eqz v6, :cond_3

    .line 38
    .line 39
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    :goto_1
    const/4 v2, -0x2

    .line 46
    :cond_3
    :goto_2
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/BaseTransientBottomBar$5;

    .line 47
    .line 48
    iget-object v5, v0, Lcom/google/android/material/snackbar/SnackbarManager;->a:Ljava/lang/Object;

    .line 49
    .line 50
    monitor-enter v5

    .line 51
    :try_start_0
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->c(Lcom/google/android/material/snackbar/SnackbarManager$Callback;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 58
    .line 59
    iput v2, v1, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->b:I

    .line 60
    .line 61
    iget-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->b:Landroid/os/Handler;

    .line 62
    .line 63
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarManager;->f(Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;)V

    .line 69
    .line 70
    .line 71
    monitor-exit v5

    .line 72
    return-void

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    goto :goto_5

    .line 75
    :cond_4
    iget-object v6, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 76
    .line 77
    if-eqz v6, :cond_5

    .line 78
    .line 79
    iget-object v6, v6, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->a:Ljava/lang/ref/WeakReference;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-ne v6, v1, :cond_5

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    :cond_5
    if-eqz v3, :cond_6

    .line 89
    .line 90
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 91
    .line 92
    iput v2, v1, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->b:I

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    new-instance v3, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 96
    .line 97
    invoke-direct {v3, v2, v1}, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;-><init>(ILcom/google/android/material/snackbar/BaseTransientBottomBar$5;)V

    .line 98
    .line 99
    .line 100
    iput-object v3, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 101
    .line 102
    :goto_3
    iget-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 103
    .line 104
    if-eqz v1, :cond_7

    .line 105
    .line 106
    invoke-virtual {v0, v1, v4}, Lcom/google/android/material/snackbar/SnackbarManager;->a(Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;I)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_7

    .line 111
    .line 112
    monitor-exit v5

    .line 113
    return-void

    .line 114
    :cond_7
    const/4 v1, 0x0

    .line 115
    iput-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 116
    .line 117
    iget-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 118
    .line 119
    if-eqz v2, :cond_9

    .line 120
    .line 121
    iput-object v2, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 122
    .line 123
    iput-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->d:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 124
    .line 125
    iget-object v2, v2, Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;->a:Ljava/lang/ref/WeakReference;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, Lcom/google/android/material/snackbar/SnackbarManager$Callback;

    .line 132
    .line 133
    if-eqz v2, :cond_8

    .line 134
    .line 135
    invoke-interface {v2}, Lcom/google/android/material/snackbar/SnackbarManager$Callback;->a()V

    .line 136
    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_8
    iput-object v1, v0, Lcom/google/android/material/snackbar/SnackbarManager;->c:Lcom/google/android/material/snackbar/SnackbarManager$SnackbarRecord;

    .line 140
    .line 141
    :cond_9
    :goto_4
    monitor-exit v5

    .line 142
    return-void

    .line 143
    :goto_5
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    throw v0
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method
