.class public abstract Ll6/l0;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:Ll6/a;

.field public static final b:Ll6/b;

.field public static final c:Ll6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "java.vm.name"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v1, "RoboVM"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x7

    .line 17
    const/4 v3, 0x6

    .line 18
    const/4 v4, 0x0

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    const-string v1, "Dalvik"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    sput-object v4, Ll6/l0;->a:Ll6/a;

    .line 30
    .line 31
    new-instance v0, Ll6/m0;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {v0, v1}, Ll6/m0;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Ll6/l0;->b:Ll6/b;

    .line 38
    .line 39
    new-instance v0, Ll6/d;

    .line 40
    .line 41
    invoke-direct {v0, v3}, Ll6/b;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Ll6/l0;->c:Ll6/b;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance v0, Ll6/a;

    .line 48
    .line 49
    invoke-direct {v0}, Ll6/a;-><init>()V

    .line 50
    .line 51
    .line 52
    sput-object v0, Ll6/l0;->a:Ll6/a;

    .line 53
    .line 54
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 55
    .line 56
    const/16 v1, 0x18

    .line 57
    .line 58
    if-lt v0, v1, :cond_1

    .line 59
    .line 60
    new-instance v0, Ll6/m0;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {v0, v1}, Ll6/m0;-><init>(I)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Ll6/l0;->b:Ll6/b;

    .line 67
    .line 68
    new-instance v0, Ll6/d;

    .line 69
    .line 70
    invoke-direct {v0, v3}, Ll6/b;-><init>(I)V

    .line 71
    .line 72
    .line 73
    sput-object v0, Ll6/l0;->c:Ll6/b;

    .line 74
    .line 75
    return-void

    .line 76
    :cond_1
    new-instance v0, Ll6/b;

    .line 77
    .line 78
    invoke-direct {v0, v2}, Ll6/b;-><init>(I)V

    .line 79
    .line 80
    .line 81
    sput-object v0, Ll6/l0;->b:Ll6/b;

    .line 82
    .line 83
    new-instance v0, Ll6/b;

    .line 84
    .line 85
    invoke-direct {v0, v3}, Ll6/b;-><init>(I)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Ll6/l0;->c:Ll6/b;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    sput-object v4, Ll6/l0;->a:Ll6/a;

    .line 92
    .line 93
    new-instance v0, Ll6/b;

    .line 94
    .line 95
    invoke-direct {v0, v2}, Ll6/b;-><init>(I)V

    .line 96
    .line 97
    .line 98
    sput-object v0, Ll6/l0;->b:Ll6/b;

    .line 99
    .line 100
    new-instance v0, Ll6/b;

    .line 101
    .line 102
    invoke-direct {v0, v3}, Ll6/b;-><init>(I)V

    .line 103
    .line 104
    .line 105
    sput-object v0, Ll6/l0;->c:Ll6/b;

    .line 106
    .line 107
    return-void
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
