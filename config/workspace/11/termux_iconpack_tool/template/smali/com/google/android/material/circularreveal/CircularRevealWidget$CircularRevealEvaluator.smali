.class public Lcom/google/android/material/circularreveal/CircularRevealWidget$CircularRevealEvaluator;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/circularreveal/CircularRevealWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CircularRevealEvaluator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/material/circularreveal/CircularRevealWidget$CircularRevealEvaluator;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/material/circularreveal/CircularRevealWidget$CircularRevealEvaluator;-><init>()V

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/circularreveal/CircularRevealWidget$CircularRevealEvaluator;->a:Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;

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
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;

    .line 2
    .line 3
    check-cast p3, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;

    .line 4
    .line 5
    iget v0, p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->a:F

    .line 6
    .line 7
    iget v1, p3, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->a:F

    .line 8
    .line 9
    invoke-static {v0, v1, p1}, Lcom/google/android/material/math/MathUtils;->a(FFF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget v1, p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->b:F

    .line 14
    .line 15
    iget v2, p3, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->b:F

    .line 16
    .line 17
    invoke-static {v1, v2, p1}, Lcom/google/android/material/math/MathUtils;->a(FFF)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget p2, p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->c:F

    .line 22
    .line 23
    iget p3, p3, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->c:F

    .line 24
    .line 25
    invoke-static {p2, p3, p1}, Lcom/google/android/material/math/MathUtils;->a(FFF)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object p2, p0, Lcom/google/android/material/circularreveal/CircularRevealWidget$CircularRevealEvaluator;->a:Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;

    .line 30
    .line 31
    iput v0, p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->a:F

    .line 32
    .line 33
    iput v1, p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->b:F

    .line 34
    .line 35
    iput p1, p2, Lcom/google/android/material/circularreveal/CircularRevealWidget$RevealInfo;->c:F

    .line 36
    .line 37
    return-object p2
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
.end method
