.class public Lcom/google/android/material/checkbox/MaterialCheckBox;
.super Landroidx/appcompat/widget/w;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/checkbox/MaterialCheckBox$SavedState;,
        Lcom/google/android/material/checkbox/MaterialCheckBox$OnErrorChangedListener;,
        Lcom/google/android/material/checkbox/MaterialCheckBox$OnCheckedStateChangedListener;,
        Lcom/google/android/material/checkbox/MaterialCheckBox$CheckedState;
    }
.end annotation


# static fields
.field public static final B:I

.field public static final C:[I

.field public static final D:[I

.field public static final E:[[I

.field public static final F:I


# instance fields
.field public final A:Lh2/c;

.field public final h:Ljava/util/LinkedHashSet;

.field public final i:Ljava/util/LinkedHashSet;

.field public j:Landroid/content/res/ColorStateList;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Ljava/lang/CharSequence;

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:Z

.field public r:Landroid/content/res/ColorStateList;

.field public s:Landroid/content/res/ColorStateList;

.field public t:Landroid/graphics/PorterDuff$Mode;

.field public u:I

.field public v:[I

.field public w:Z

.field public x:Ljava/lang/CharSequence;

.field public y:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field public final z:Lh2/f;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget v0, Lcom/google/android/material/R$style;->Widget_MaterialComponents_CompoundButton_CheckBox:I

    .line 2
    .line 3
    sput v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->B:I

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/R$attr;->state_indeterminate:I

    .line 6
    .line 7
    filled-new-array {v0}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->C:[I

    .line 12
    .line 13
    sget v0, Lcom/google/android/material/R$attr;->state_error:I

    .line 14
    .line 15
    filled-new-array {v0}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sput-object v1, Lcom/google/android/material/checkbox/MaterialCheckBox;->D:[I

    .line 20
    .line 21
    const v1, 0x101009e

    .line 22
    .line 23
    .line 24
    filled-new-array {v1, v0}, [I

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v2, 0x5

    .line 29
    new-array v2, v2, [[I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    aput-object v0, v2, v3

    .line 33
    .line 34
    const v0, 0x10100a0

    .line 35
    .line 36
    .line 37
    filled-new-array {v1, v0}, [I

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x1

    .line 42
    aput-object v3, v2, v4

    .line 43
    .line 44
    const v3, -0x10100a0

    .line 45
    .line 46
    .line 47
    filled-new-array {v1, v3}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v4, 0x2

    .line 52
    aput-object v1, v2, v4

    .line 53
    .line 54
    const v1, -0x101009e

    .line 55
    .line 56
    .line 57
    filled-new-array {v1, v0}, [I

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const/4 v4, 0x3

    .line 62
    aput-object v0, v2, v4

    .line 63
    .line 64
    filled-new-array {v1, v3}, [I

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const/4 v1, 0x4

    .line 69
    aput-object v0, v2, v1

    .line 70
    .line 71
    sput-object v2, Lcom/google/android/material/checkbox/MaterialCheckBox;->E:[[I

    .line 72
    .line 73
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    const-string v1, "drawable"

    .line 78
    .line 79
    const-string v2, "android"

    .line 80
    .line 81
    const-string v3, "btn_check_material_anim"

    .line 82
    .line 83
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    sput v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->F:I

    .line 88
    .line 89
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11

    .line 1
    sget v3, Lcom/google/android/material/R$attr;->checkboxStyle:I

    .line 2
    .line 3
    sget v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->B:I

    .line 4
    .line 5
    invoke-static {p1, p2, v3, v0}, Lcom/google/android/material/theme/overlay/MaterialThemeOverlay;->a(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1, p2, v3}, Landroidx/appcompat/widget/w;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->h:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->i:Ljava/util/LinkedHashSet;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    sget v0, Lcom/google/android/material/R$drawable;->mtrl_checkbox_button_checked_unchecked:I

    .line 31
    .line 32
    const-string v1, "parser error"

    .line 33
    .line 34
    const-string v2, "AnimatedVDCompat"

    .line 35
    .line 36
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 37
    .line 38
    const/16 v5, 0x18

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    if-lt v4, v5, :cond_0

    .line 44
    .line 45
    new-instance v1, Lh2/f;

    .line 46
    .line 47
    invoke-direct {v1, p1, v7}, Lh2/f;-><init>(Landroid/content/Context;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    sget-object v4, Ld0/n;->a:Ljava/lang/ThreadLocal;

    .line 59
    .line 60
    invoke-static {v2, v0, p1}, Ld0/i;->a(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, v1, Lh2/i;->h:Landroid/graphics/drawable/Drawable;

    .line 65
    .line 66
    iget-object v0, v1, Lh2/f;->m:Lh/f;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lh2/e;

    .line 72
    .line 73
    iget-object v0, v1, Lh2/i;->h:Landroid/graphics/drawable/Drawable;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-direct {p1, v0}, Lh2/e;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_0
    sget v4, Lh2/f;->n:I

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :try_start_0
    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v0}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    :goto_0
    invoke-interface {v0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    const/4 v9, 0x2

    .line 102
    if-eq v5, v9, :cond_1

    .line 103
    .line 104
    if-eq v5, v6, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    if-ne v5, v9, :cond_2

    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    new-instance v10, Lh2/f;

    .line 118
    .line 119
    invoke-direct {v10, p1, v7}, Lh2/f;-><init>(Landroid/content/Context;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v10, v5, v0, v4, v9}, Lh2/f;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 123
    .line 124
    .line 125
    move-object v1, v10

    .line 126
    goto :goto_4

    .line 127
    :catch_0
    move-exception v0

    .line 128
    move-object p1, v0

    .line 129
    goto :goto_1

    .line 130
    :catch_1
    move-exception v0

    .line 131
    move-object p1, v0

    .line 132
    goto :goto_2

    .line 133
    :cond_2
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    .line 134
    .line 135
    const-string v0, "No start tag found"

    .line 136
    .line 137
    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    :goto_1
    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :goto_2
    invoke-static {v2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 146
    .line 147
    .line 148
    :goto_3
    move-object v1, v8

    .line 149
    :goto_4
    iput-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->z:Lh2/f;

    .line 150
    .line 151
    new-instance p1, Lcom/google/android/material/checkbox/MaterialCheckBox$1;

    .line 152
    .line 153
    invoke-direct {p1, p0}, Lcom/google/android/material/checkbox/MaterialCheckBox$1;-><init>(Lcom/google/android/material/checkbox/MaterialCheckBox;)V

    .line 154
    .line 155
    .line 156
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->A:Lh2/c;

    .line 157
    .line 158
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-static {p0}, Le6/d;->m(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 167
    .line 168
    invoke-direct {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getSuperButtonTintList()Landroid/content/res/ColorStateList;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 173
    .line 174
    invoke-interface {p0, v8}, Ls0/s;->setSupportButtonTintList(Landroid/content/res/ColorStateList;)V

    .line 175
    .line 176
    .line 177
    sget-object v2, Lcom/google/android/material/R$styleable;->MaterialCheckBox:[I

    .line 178
    .line 179
    sget v4, Lcom/google/android/material/checkbox/MaterialCheckBox;->B:I

    .line 180
    .line 181
    new-array v5, v7, [I

    .line 182
    .line 183
    move-object v1, p2

    .line 184
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/ThemeEnforcement;->e(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)La1/w;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    iget-object p2, p1, La1/w;->i:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p2, Landroid/content/res/TypedArray;

    .line 191
    .line 192
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCheckBox_buttonIcon:I

    .line 193
    .line 194
    invoke-virtual {p1, v1}, La1/w;->t(I)Landroid/graphics/drawable/Drawable;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    iput-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 199
    .line 200
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 201
    .line 202
    if-eqz v1, :cond_3

    .line 203
    .line 204
    sget v1, Lcom/google/android/material/R$attr;->isMaterial3Theme:I

    .line 205
    .line 206
    invoke-static {v0, v1, v7}, Lcom/google/android/material/resources/MaterialAttributes;->b(Landroid/content/Context;IZ)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_3

    .line 211
    .line 212
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCheckBox_android_button:I

    .line 213
    .line 214
    invoke-virtual {p2, v1, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    sget v2, Lcom/google/android/material/R$styleable;->MaterialCheckBox_buttonCompat:I

    .line 219
    .line 220
    invoke-virtual {p2, v2, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    sget v3, Lcom/google/android/material/checkbox/MaterialCheckBox;->F:I

    .line 225
    .line 226
    if-ne v1, v3, :cond_3

    .line 227
    .line 228
    if-nez v2, :cond_3

    .line 229
    .line 230
    invoke-super {p0, v8}, Landroidx/appcompat/widget/w;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 231
    .line 232
    .line 233
    sget v1, Lcom/google/android/material/R$drawable;->mtrl_checkbox_button:I

    .line 234
    .line 235
    invoke-static {v0, v1}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    iput-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 240
    .line 241
    iput-boolean v6, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->q:Z

    .line 242
    .line 243
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 244
    .line 245
    if-nez v1, :cond_3

    .line 246
    .line 247
    sget v1, Lcom/google/android/material/R$drawable;->mtrl_checkbox_button_icon:I

    .line 248
    .line 249
    invoke-static {v0, v1}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iput-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 254
    .line 255
    :cond_3
    sget v1, Lcom/google/android/material/R$styleable;->MaterialCheckBox_buttonIconTint:I

    .line 256
    .line 257
    invoke-static {v0, p1, v1}, Lcom/google/android/material/resources/MaterialResources;->a(Landroid/content/Context;La1/w;I)Landroid/content/res/ColorStateList;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    iput-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 262
    .line 263
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_buttonIconTintMode:I

    .line 264
    .line 265
    const/4 v1, -0x1

    .line 266
    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 271
    .line 272
    invoke-static {v0, v1}, Lcom/google/android/material/internal/ViewUtils;->f(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    iput-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->t:Landroid/graphics/PorterDuff$Mode;

    .line 277
    .line 278
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_useMaterialThemeColors:I

    .line 279
    .line 280
    invoke-virtual {p2, v0, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    iput-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->k:Z

    .line 285
    .line 286
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_centerIfNoTextEnabled:I

    .line 287
    .line 288
    invoke-virtual {p2, v0, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    iput-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->l:Z

    .line 293
    .line 294
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_errorShown:I

    .line 295
    .line 296
    invoke-virtual {p2, v0, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    iput-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->m:Z

    .line 301
    .line 302
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_errorAccessibilityLabel:I

    .line 303
    .line 304
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    iput-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->n:Ljava/lang/CharSequence;

    .line 309
    .line 310
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_checkedState:I

    .line 311
    .line 312
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_4

    .line 317
    .line 318
    sget v0, Lcom/google/android/material/R$styleable;->MaterialCheckBox_checkedState:I

    .line 319
    .line 320
    invoke-virtual {p2, v0, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 321
    .line 322
    .line 323
    move-result p2

    .line 324
    invoke-virtual {p0, p2}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setCheckedState(I)V

    .line 325
    .line 326
    .line 327
    :cond_4
    invoke-virtual {p1}, La1/w;->E()V

    .line 328
    .line 329
    .line 330
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

    .line 331
    .line 332
    .line 333
    return-void
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

.method private getButtonStateDescription()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget v1, Lcom/google/android/material/R$string;->mtrl_checkbox_state_description_checked:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget v1, Lcom/google/android/material/R$string;->mtrl_checkbox_state_description_unchecked:I

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget v1, Lcom/google/android/material/R$string;->mtrl_checkbox_state_description_indeterminate:I

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0
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
.end method

.method private getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->j:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v0, Lcom/google/android/material/R$attr;->colorControlActivated:I

    .line 6
    .line 7
    invoke-static {p0, v0}, Lcom/google/android/material/color/MaterialColors;->c(Landroid/view/View;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    sget v1, Lcom/google/android/material/R$attr;->colorError:I

    .line 12
    .line 13
    invoke-static {p0, v1}, Lcom/google/android/material/color/MaterialColors;->c(Landroid/view/View;I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    sget v2, Lcom/google/android/material/R$attr;->colorSurface:I

    .line 18
    .line 19
    invoke-static {p0, v2}, Lcom/google/android/material/color/MaterialColors;->c(Landroid/view/View;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    sget v3, Lcom/google/android/material/R$attr;->colorOnSurface:I

    .line 24
    .line 25
    invoke-static {p0, v3}, Lcom/google/android/material/color/MaterialColors;->c(Landroid/view/View;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/high16 v4, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-static {v2, v1, v4}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {v2, v0, v4}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const v4, 0x3f0a3d71    # 0.54f

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3, v4}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const v5, 0x3ec28f5c    # 0.38f

    .line 47
    .line 48
    .line 49
    invoke-static {v2, v3, v5}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    invoke-static {v2, v3, v5}, Lcom/google/android/material/color/MaterialColors;->e(IIF)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    filled-new-array {v1, v0, v4, v6, v2}, [I

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 62
    .line 63
    sget-object v2, Lcom/google/android/material/checkbox/MaterialCheckBox;->E:[[I

    .line 64
    .line 65
    invoke-direct {v1, v2, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->j:Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->j:Landroid/content/res/ColorStateList;

    .line 71
    .line 72
    return-object v0
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
.end method

.method private getSuperButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-super {p0}, Landroid/widget/CheckBox;->getButtonTintList()Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-super {p0}, Landroid/widget/CheckBox;->getButtonTintList()Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_1
    invoke-interface {p0}, Ls0/s;->getSupportButtonTintList()Landroid/content/res/ColorStateList;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
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


# virtual methods
.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-static {p0}, Ls0/b;->b(Landroid/widget/CompoundButton;)Landroid/graphics/PorterDuff$Mode;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    const/16 v6, 0x17

    .line 14
    .line 15
    if-ge v3, v6, :cond_0

    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v7, 0x0

    .line 20
    :goto_0
    invoke-static {v0, v1, v2, v7}, Lcom/google/android/material/drawable/DrawableUtils;->b(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Z)Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->t:Landroid/graphics/PorterDuff$Mode;

    .line 31
    .line 32
    if-ge v3, v6, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v4, 0x0

    .line 36
    :goto_1
    invoke-static {v0, v1, v2, v4}, Lcom/google/android/material/drawable/DrawableUtils;->b(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;Z)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->q:Z

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_2
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->z:Lh2/f;

    .line 49
    .line 50
    if-eqz v0, :cond_d

    .line 51
    .line 52
    iget-object v1, v0, Lh2/f;->i:Lh2/d;

    .line 53
    .line 54
    iget-object v2, v0, Lh2/i;->h:Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->A:Lh2/c;

    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    check-cast v2, Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 61
    .line 62
    iget-object v6, v4, Lh2/c;->a:Lh2/b;

    .line 63
    .line 64
    if-nez v6, :cond_3

    .line 65
    .line 66
    new-instance v6, Lh2/b;

    .line 67
    .line 68
    invoke-direct {v6, v4}, Lh2/b;-><init>(Lh2/c;)V

    .line 69
    .line 70
    .line 71
    iput-object v6, v4, Lh2/c;->a:Lh2/b;

    .line 72
    .line 73
    :cond_3
    iget-object v6, v4, Lh2/c;->a:Lh2/b;

    .line 74
    .line 75
    invoke-static {v2, v6}, Landroidx/appcompat/widget/t0;->u(Landroid/graphics/drawable/AnimatedVectorDrawable;Landroid/graphics/drawable/Animatable2$AnimationCallback;)Z

    .line 76
    .line 77
    .line 78
    :cond_4
    iget-object v2, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    if-nez v4, :cond_5

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_5
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_6

    .line 95
    .line 96
    iget-object v2, v0, Lh2/f;->k:Landroidx/appcompat/widget/c;

    .line 97
    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    iget-object v6, v1, Lh2/d;->b:Landroid/animation/AnimatorSet;

    .line 101
    .line 102
    invoke-virtual {v6, v2}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 103
    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    iput-object v2, v0, Lh2/f;->k:Landroidx/appcompat/widget/c;

    .line 107
    .line 108
    :cond_6
    :goto_2
    iget-object v2, v0, Lh2/i;->h:Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    if-eqz v2, :cond_8

    .line 111
    .line 112
    check-cast v2, Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 113
    .line 114
    iget-object v1, v4, Lh2/c;->a:Lh2/b;

    .line 115
    .line 116
    if-nez v1, :cond_7

    .line 117
    .line 118
    new-instance v1, Lh2/b;

    .line 119
    .line 120
    invoke-direct {v1, v4}, Lh2/b;-><init>(Lh2/c;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, v4, Lh2/c;->a:Lh2/b;

    .line 124
    .line 125
    :cond_7
    iget-object v1, v4, Lh2/c;->a:Lh2/b;

    .line 126
    .line 127
    invoke-static {v2, v1}, Landroidx/appcompat/widget/t0;->i(Landroid/graphics/drawable/AnimatedVectorDrawable;Landroid/graphics/drawable/Animatable2$AnimationCallback;)V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    if-nez v4, :cond_9

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_9
    iget-object v2, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 135
    .line 136
    if-nez v2, :cond_a

    .line 137
    .line 138
    new-instance v2, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object v2, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 144
    .line 145
    :cond_a
    iget-object v2, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 146
    .line 147
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_b

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_b
    iget-object v2, v0, Lh2/f;->l:Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    iget-object v2, v0, Lh2/f;->k:Landroidx/appcompat/widget/c;

    .line 160
    .line 161
    if-nez v2, :cond_c

    .line 162
    .line 163
    new-instance v2, Landroidx/appcompat/widget/c;

    .line 164
    .line 165
    const/4 v4, 0x3

    .line 166
    invoke-direct {v2, v4, v0}, Landroidx/appcompat/widget/c;-><init>(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iput-object v2, v0, Lh2/f;->k:Landroidx/appcompat/widget/c;

    .line 170
    .line 171
    :cond_c
    iget-object v1, v1, Lh2/d;->b:Landroid/animation/AnimatorSet;

    .line 172
    .line 173
    iget-object v2, v0, Lh2/f;->k:Landroidx/appcompat/widget/c;

    .line 174
    .line 175
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 176
    .line 177
    .line 178
    :cond_d
    :goto_3
    const/16 v1, 0x18

    .line 179
    .line 180
    if-lt v3, v1, :cond_e

    .line 181
    .line 182
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 183
    .line 184
    instance-of v2, v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    .line 185
    .line 186
    if-eqz v2, :cond_e

    .line 187
    .line 188
    if-eqz v0, :cond_e

    .line 189
    .line 190
    check-cast v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    .line 191
    .line 192
    sget v2, Lcom/google/android/material/R$id;->checked:I

    .line 193
    .line 194
    sget v3, Lcom/google/android/material/R$id;->unchecked:I

    .line 195
    .line 196
    invoke-virtual {v1, v2, v3, v0, v5}, Landroid/graphics/drawable/AnimatedStateListDrawable;->addTransition(IILandroid/graphics/drawable/Drawable;Z)V

    .line 197
    .line 198
    .line 199
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 200
    .line 201
    check-cast v1, Landroid/graphics/drawable/AnimatedStateListDrawable;

    .line 202
    .line 203
    sget v2, Lcom/google/android/material/R$id;->indeterminate:I

    .line 204
    .line 205
    sget v3, Lcom/google/android/material/R$id;->unchecked:I

    .line 206
    .line 207
    invoke-virtual {v1, v2, v3, v0, v5}, Landroid/graphics/drawable/AnimatedStateListDrawable;->addTransition(IILandroid/graphics/drawable/Drawable;Z)V

    .line 208
    .line 209
    .line 210
    :cond_e
    :goto_4
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 211
    .line 212
    if-eqz v0, :cond_f

    .line 213
    .line 214
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 215
    .line 216
    if-eqz v1, :cond_f

    .line 217
    .line 218
    invoke-static {v0, v1}, Lf0/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 219
    .line 220
    .line 221
    :cond_f
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 222
    .line 223
    if-eqz v0, :cond_10

    .line 224
    .line 225
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 226
    .line 227
    if-eqz v1, :cond_10

    .line 228
    .line 229
    invoke-static {v0, v1}, Lf0/a;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 230
    .line 231
    .line 232
    :cond_10
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 233
    .line 234
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 235
    .line 236
    const/4 v2, -0x1

    .line 237
    invoke-static {v0, v1, v2, v2}, Lcom/google/android/material/drawable/DrawableUtils;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;II)Landroid/graphics/drawable/Drawable;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-super {p0, v0}, Landroidx/appcompat/widget/w;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 245
    .line 246
    .line 247
    return-void
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
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method

.method public getButtonDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
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

.method public getButtonIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
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

.method public getButtonIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
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

.method public getButtonIconTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->t:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    return-object v0
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

.method public getButtonTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object v0
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

.method public getCheckedState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->u:I

    .line 2
    .line 3
    return v0
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

.method public getErrorAccessibilityLabel()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->n:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
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

.method public final isChecked()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->u:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public final onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/CheckBox;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->k:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setUseMaterialThemeColors(Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
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

.method public final onCreateDrawableState(I)[I
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    add-int/2addr p1, v0

    .line 3
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onCreateDrawableState(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getCheckedState()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->C:[I

    .line 14
    .line 15
    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->m:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object v0, Lcom/google/android/material/checkbox/MaterialCheckBox;->D:[I

    .line 23
    .line 24
    invoke-static {p1, v0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {p1}, Lcom/google/android/material/drawable/DrawableUtils;->c([I)[I

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->v:[I

    .line 32
    .line 33
    return-object p1
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-static {p0}, Le6/d;->m(Landroid/widget/CompoundButton;)Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-static {p0}, Lcom/google/android/material/internal/ViewUtils;->e(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x1

    .line 30
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    sub-int/2addr v2, v3

    .line 39
    div-int/lit8 v2, v2, 0x2

    .line 40
    .line 41
    mul-int v2, v2, v1

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    int-to-float v3, v2

    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Canvas;->translate(FF)V

    .line 50
    .line 51
    .line 52
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onDraw(Landroid/graphics/Canvas;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 73
    .line 74
    add-int/2addr v1, v2

    .line 75
    iget v3, p1, Landroid/graphics/Rect;->top:I

    .line 76
    .line 77
    iget v4, p1, Landroid/graphics/Rect;->right:I

    .line 78
    .line 79
    add-int/2addr v4, v2

    .line 80
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 81
    .line 82
    invoke-static {v0, v1, v3, v4, p1}, Lf0/a;->f(Landroid/graphics/drawable/Drawable;IIII)V

    .line 83
    .line 84
    .line 85
    :cond_1
    return-void

    .line 86
    :cond_2
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onDraw(Landroid/graphics/Canvas;)V

    .line 87
    .line 88
    .line 89
    return-void
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
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->m:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", "

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->n:Ljava/lang/CharSequence;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/material/checkbox/MaterialCheckBox$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/google/android/material/checkbox/MaterialCheckBox$SavedState;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-super {p0, v0}, Landroid/widget/CheckBox;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget p1, p1, Lcom/google/android/material/checkbox/MaterialCheckBox$SavedState;->h:I

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setCheckedState(I)V

    .line 21
    .line 22
    .line 23
    return-void
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

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/CheckBox;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/google/android/material/checkbox/MaterialCheckBox$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getCheckedState()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, v1, Lcom/google/android/material/checkbox/MaterialCheckBox$SavedState;->h:I

    .line 15
    .line 16
    return-object v1
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

.method public setButtonDrawable(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->o:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->q:Z

    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

    return-void
.end method

.method public setButtonIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

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

.method public setButtonIconDrawableResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, La/a;->D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setButtonIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public setButtonIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->s:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

    .line 9
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setButtonIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->t:Landroid/graphics/PorterDuff$Mode;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->t:Landroid/graphics/PorterDuff$Mode;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

    .line 9
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setButtonTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->r:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

    .line 9
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ls0/s;->setSupportButtonTintMode(Landroid/graphics/PorterDuff$Mode;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->b()V

    .line 5
    .line 6
    .line 7
    return-void
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

.method public setCenterIfNoTextEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->l:Z

    .line 2
    .line 3
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setChecked(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setCheckedState(I)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setCheckedState(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->u:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_6

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->u:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 18
    .line 19
    .line 20
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v2, 0x1e

    .line 23
    .line 24
    if-lt p1, v2, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->x:Ljava/lang/CharSequence;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getButtonStateDescription()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->w:Z

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    iput-boolean v1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->w:Z

    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->i:Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    check-cast v1, Lcom/google/android/material/checkbox/MaterialCheckBox$OnCheckedStateChangedListener;

    .line 63
    .line 64
    invoke-interface {v1}, Lcom/google/android/material/checkbox/MaterialCheckBox$OnCheckedStateChangedListener;->a()V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    iget p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->u:I

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    if-eq p1, v1, :cond_4

    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->y:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->isChecked()Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-interface {p1, p0, v1}, Landroid/widget/CompoundButton$OnCheckedChangeListener;->onCheckedChanged(Landroid/widget/CompoundButton;Z)V

    .line 82
    .line 83
    .line 84
    :cond_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 v1, 0x1a

    .line 87
    .line 88
    if-lt p1, v1, :cond_5

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-class v1, Landroid/view/autofill/AutofillManager;

    .line 95
    .line 96
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Landroid/view/autofill/AutofillManager;

    .line 101
    .line 102
    if-eqz p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Landroid/view/autofill/AutofillManager;->notifyValueChanged(Landroid/view/View;)V

    .line 105
    .line 106
    .line 107
    :cond_5
    iput-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->w:Z

    .line 108
    .line 109
    :cond_6
    :goto_2
    return-void
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
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setErrorAccessibilityLabel(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->n:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setErrorAccessibilityLabelResource(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setErrorAccessibilityLabel(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
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

.method public setErrorShown(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->m:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->m:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->h:Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/google/android/material/checkbox/MaterialCheckBox$OnErrorChangedListener;

    .line 28
    .line 29
    invoke-interface {v0}, Lcom/google/android/material/checkbox/MaterialCheckBox$OnErrorChangedListener;->a()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->y:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 2
    .line 3
    return-void
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
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public setStateDescription(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->x:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1e

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getButtonStateDescription()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->setStateDescription(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void
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

.method public setUseMaterialThemeColors(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/checkbox/MaterialCheckBox;->k:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->getMaterialThemeColorsTintList()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p0, p1}, Ls0/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    invoke-static {p0, p1}, Ls0/b;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    .line 15
    .line 16
    .line 17
    return-void
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

.method public final toggle()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->isChecked()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/material/checkbox/MaterialCheckBox;->setChecked(Z)V

    .line 8
    .line 9
    .line 10
    return-void
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
