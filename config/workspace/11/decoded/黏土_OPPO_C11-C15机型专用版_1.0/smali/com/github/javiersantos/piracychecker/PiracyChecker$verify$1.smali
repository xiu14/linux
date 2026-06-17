.class public final Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/github/javiersantos/licensing/LibraryCheckerCallback;


# instance fields
.field public final synthetic a:Lcom/github/javiersantos/piracychecker/PiracyChecker;


# direct methods
.method public constructor <init>(Lcom/github/javiersantos/piracychecker/PiracyChecker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->a:Lcom/github/javiersantos/piracychecker/PiracyChecker;

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
.method public final a()V
    .locals 2

    .line 1
    sget v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->t:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->a:Lcom/github/javiersantos/piracychecker/PiracyChecker;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/github/javiersantos/piracychecker/PiracyChecker;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
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

.method public final b(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->a:Lcom/github/javiersantos/piracychecker/PiracyChecker;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->n:Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->w:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError$Companion;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->u:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_0
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->t:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_1
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->s:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_2
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->r:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_3
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->q:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_4
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->p:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :pswitch_5
    sget-object p1, Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;->o:Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;

    .line 34
    .line 35
    :goto_0
    invoke-interface {v0, p1}, Lcom/github/javiersantos/piracychecker/callbacks/OnErrorCallback;->onError(Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public final c()V
    .locals 2

    .line 1
    sget v0, Lcom/github/javiersantos/piracychecker/PiracyChecker;->t:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/github/javiersantos/piracychecker/PiracyChecker$verify$1;->a:Lcom/github/javiersantos/piracychecker/PiracyChecker;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/github/javiersantos/piracychecker/PiracyChecker;->b(Z)V

    .line 7
    .line 8
    .line 9
    return-void
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
