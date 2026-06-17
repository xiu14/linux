.class public final enum Lcom/github/javiersantos/piracychecker/enums/Display;
.super Ljava/lang/Enum;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/github/javiersantos/piracychecker/enums/Display;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum h:Lcom/github/javiersantos/piracychecker/enums/Display;

.field public static final synthetic i:[Lcom/github/javiersantos/piracychecker/enums/Display;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 2
    .line 3
    const-string v1, "DIALOG"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/github/javiersantos/piracychecker/enums/Display;->h:Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 10
    .line 11
    new-instance v1, Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 12
    .line 13
    const-string v3, "ACTIVITY"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    new-array v3, v3, [Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 21
    .line 22
    aput-object v0, v3, v2

    .line 23
    .line 24
    aput-object v1, v3, v4

    .line 25
    .line 26
    sput-object v3, Lcom/github/javiersantos/piracychecker/enums/Display;->i:[Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/github/javiersantos/piracychecker/enums/Display;
    .locals 1

    .line 1
    const-class v0, Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 8
    .line 9
    return-object p0
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

.method public static values()[Lcom/github/javiersantos/piracychecker/enums/Display;
    .locals 1

    .line 1
    sget-object v0, Lcom/github/javiersantos/piracychecker/enums/Display;->i:[Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/github/javiersantos/piracychecker/enums/Display;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/github/javiersantos/piracychecker/enums/Display;

    .line 8
    .line 9
    return-object v0
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
