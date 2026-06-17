.class public final Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;
.super Landroid/graphics/ColorMatrix;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion;

.field private static final PROP_ALPHA:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROP_BRIGHTNESS:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final PROP_SATURATION:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final alphaFloatProp:Ldev/jahir/frames/ui/animations/FloatProp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldev/jahir/frames/ui/animations/FloatProp<",
            "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
            ">;"
        }
    .end annotation
.end field

.field private static final brightnessFloatProp:Ldev/jahir/frames/ui/animations/FloatProp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldev/jahir/frames/ui/animations/FloatProp<",
            "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
            ">;"
        }
    .end annotation
.end field

.field private static final saturationFloatProp:Ldev/jahir/frames/ui/animations/FloatProp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldev/jahir/frames/ui/animations/FloatProp<",
            "Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private alphaFraction:F

.field private brightnessFraction:F

.field private final elements:[F

.field private saturationFraction:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->Companion:Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion;

    .line 8
    .line 9
    new-instance v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$saturationFloatProp$1;

    .line 10
    .line 11
    invoke-direct {v0}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$saturationFloatProp$1;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->saturationFloatProp:Ldev/jahir/frames/ui/animations/FloatProp;

    .line 15
    .line 16
    new-instance v1, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$alphaFloatProp$1;

    .line 17
    .line 18
    invoke-direct {v1}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$alphaFloatProp$1;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->alphaFloatProp:Ldev/jahir/frames/ui/animations/FloatProp;

    .line 22
    .line 23
    new-instance v2, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$brightnessFloatProp$1;

    .line 24
    .line 25
    invoke-direct {v2}, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix$Companion$brightnessFloatProp$1;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v2, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->brightnessFloatProp:Ldev/jahir/frames/ui/animations/FloatProp;

    .line 29
    .line 30
    invoke-static {v0}, Ldev/jahir/frames/ui/animations/FloatPropertyKt;->createFloatProperty(Ldev/jahir/frames/ui/animations/FloatProp;)Landroid/util/Property;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->PROP_SATURATION:Landroid/util/Property;

    .line 35
    .line 36
    invoke-static {v1}, Ldev/jahir/frames/ui/animations/FloatPropertyKt;->createFloatProperty(Ldev/jahir/frames/ui/animations/FloatProp;)Landroid/util/Property;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->PROP_ALPHA:Landroid/util/Property;

    .line 41
    .line 42
    invoke-static {v2}, Ldev/jahir/frames/ui/animations/FloatPropertyKt;->createFloatProperty(Ldev/jahir/frames/ui/animations/FloatProp;)Landroid/util/Property;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->PROP_BRIGHTNESS:Landroid/util/Property;

    .line 47
    .line 48
    return-void
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

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/ColorMatrix;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x14

    .line 5
    .line 6
    new-array v0, v0, [F

    .line 7
    .line 8
    iput-object v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->saturationFraction:F

    .line 13
    .line 14
    iput v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->alphaFraction:F

    .line 15
    .line 16
    iput v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->brightnessFraction:F

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
.end method

.method public static final synthetic access$getPROP_ALPHA$cp()Landroid/util/Property;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->PROP_ALPHA:Landroid/util/Property;

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

.method public static final synthetic access$getPROP_BRIGHTNESS$cp()Landroid/util/Property;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->PROP_BRIGHTNESS:Landroid/util/Property;

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

.method public static final synthetic access$getPROP_SATURATION$cp()Landroid/util/Property;
    .locals 1

    .line 1
    sget-object v0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->PROP_SATURATION:Landroid/util/Property;

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


# virtual methods
.method public final getAlphaFraction()F
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->alphaFraction:F

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

.method public final getBrightnessFraction()F
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->brightnessFraction:F

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

.method public final getSaturationFraction()F
    .locals 1

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->saturationFraction:F

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

.method public final setAlphaFraction(F)V
    .locals 4

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->alphaFraction:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/ColorMatrix;->getArray()[F

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 13
    .line 14
    const/16 v2, 0x14

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 21
    .line 22
    const/16 v1, 0x12

    .line 23
    .line 24
    aput p1, v0, v1

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iput p1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->alphaFraction:F

    .line 30
    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public final setBrightnessFraction(F)V
    .locals 4

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->brightnessFraction:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/ColorMatrix;->getArray()[F

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 13
    .line 14
    const/16 v2, 0x14

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    int-to-float v0, v0

    .line 22
    sub-float/2addr v0, p1

    .line 23
    const/16 v1, 0xff

    .line 24
    .line 25
    int-to-float v1, v1

    .line 26
    mul-float v0, v0, v1

    .line 27
    .line 28
    iget-object v1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 29
    .line 30
    neg-float v0, v0

    .line 31
    const/4 v2, 0x4

    .line 32
    aput v0, v1, v2

    .line 33
    .line 34
    const/16 v2, 0x9

    .line 35
    .line 36
    aput v0, v1, v2

    .line 37
    .line 38
    const/16 v2, 0xe

    .line 39
    .line 40
    aput v0, v1, v2

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 43
    .line 44
    .line 45
    :goto_0
    iput p1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->brightnessFraction:F

    .line 46
    .line 47
    return-void
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

.method public final setSaturationFraction(F)V
    .locals 7

    .line 1
    iget v0, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->saturationFraction:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/ColorMatrix;->getArray()[F

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 13
    .line 14
    const/16 v2, 0x14

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    int-to-float v1, v0

    .line 22
    sub-float/2addr v1, p1

    .line 23
    const v2, 0x3e5a1cac    # 0.213f

    .line 24
    .line 25
    .line 26
    mul-float v2, v2, v1

    .line 27
    .line 28
    const v4, 0x3f370a3d    # 0.715f

    .line 29
    .line 30
    .line 31
    mul-float v4, v4, v1

    .line 32
    .line 33
    const v5, 0x3d9374bc    # 0.072f

    .line 34
    .line 35
    .line 36
    mul-float v1, v1, v5

    .line 37
    .line 38
    iget-object v5, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->elements:[F

    .line 39
    .line 40
    add-float v6, v2, p1

    .line 41
    .line 42
    aput v6, v5, v3

    .line 43
    .line 44
    aput v4, v5, v0

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    aput v1, v5, v0

    .line 48
    .line 49
    const/4 v0, 0x5

    .line 50
    aput v2, v5, v0

    .line 51
    .line 52
    const/4 v0, 0x6

    .line 53
    add-float v3, v4, p1

    .line 54
    .line 55
    aput v3, v5, v0

    .line 56
    .line 57
    const/4 v0, 0x7

    .line 58
    aput v1, v5, v0

    .line 59
    .line 60
    const/16 v0, 0xa

    .line 61
    .line 62
    aput v2, v5, v0

    .line 63
    .line 64
    const/16 v0, 0xb

    .line 65
    .line 66
    aput v4, v5, v0

    .line 67
    .line 68
    const/16 v0, 0xc

    .line 69
    .line 70
    add-float/2addr v1, p1

    .line 71
    aput v1, v5, v0

    .line 72
    .line 73
    invoke-virtual {p0, v5}, Landroid/graphics/ColorMatrix;->set([F)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iput p1, p0, Ldev/jahir/frames/ui/graphics/ImageLoadingColorMatrix;->saturationFraction:F

    .line 77
    .line 78
    return-void
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
