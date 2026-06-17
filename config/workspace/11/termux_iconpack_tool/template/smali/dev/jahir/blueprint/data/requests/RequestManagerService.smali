.class public interface abstract Ldev/jahir/blueprint/data/requests/RequestManagerService;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# virtual methods
.method public abstract uploadRequest(Ljava/lang/String;Ljava/lang/String;Lw5/s;Lt4/c;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lo6/i;
            value = "TokenID"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lo6/q;
            value = "apps"
        .end annotation
    .end param
    .param p3    # Lw5/s;
        .annotation runtime Lo6/q;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lw5/s;",
            "Lt4/c<",
            "-",
            "Ldev/jahir/blueprint/data/models/RequestManagerResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lo6/k;
        value = {
            "Accept: application/json",
            "User-Agent: afollestad/icon-request"
        }
    .end annotation

    .annotation runtime Lo6/l;
    .end annotation

    .annotation runtime Lo6/o;
        value = "v1/request"
    .end annotation
.end method
