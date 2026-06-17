.class Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener$1;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;


# direct methods
.method public constructor <init>(Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener$1;->h:Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;

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
.method public final run()V
    .locals 4

    .line 1
    const-string v0, "LibraryChecker"

    .line 2
    .line 3
    const-string v1, "Check timed out."

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener$1;->h:Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;->e:Lcom/github/javiersantos/licensing/LibraryChecker;

    .line 11
    .line 12
    iget-object v2, v0, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;->c:Lcom/github/javiersantos/licensing/LibraryValidator;

    .line 13
    .line 14
    sget-object v3, Lcom/github/javiersantos/licensing/LibraryChecker;->j:Ljava/security/SecureRandom;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lcom/github/javiersantos/licensing/LibraryChecker;->d(Lcom/github/javiersantos/licensing/LibraryValidator;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v0, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;->e:Lcom/github/javiersantos/licensing/LibraryChecker;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/github/javiersantos/licensing/LibraryChecker$ResultListener;->c:Lcom/github/javiersantos/licensing/LibraryValidator;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/github/javiersantos/licensing/LibraryChecker;->c(Lcom/github/javiersantos/licensing/LibraryValidator;)V

    .line 24
    .line 25
    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
