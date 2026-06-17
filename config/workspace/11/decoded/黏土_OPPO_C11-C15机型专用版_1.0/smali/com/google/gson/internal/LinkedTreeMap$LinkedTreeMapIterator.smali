.class abstract Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/gson/internal/LinkedTreeMap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "LinkedTreeMapIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public h:Lcom/google/gson/internal/LinkedTreeMap$Node;

.field public i:Lcom/google/gson/internal/LinkedTreeMap$Node;

.field public j:I

.field public final synthetic k:Lcom/google/gson/internal/LinkedTreeMap;


# direct methods
.method public constructor <init>(Lcom/google/gson/internal/LinkedTreeMap;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->k:Lcom/google/gson/internal/LinkedTreeMap;

    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/gson/internal/LinkedTreeMap;->m:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->k:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 14
    .line 15
    iget p1, p1, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 16
    .line 17
    iput p1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->j:I

    .line 18
    .line 19
    return-void
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
.method public final a()Lcom/google/gson/internal/LinkedTreeMap$Node;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->k:Lcom/google/gson/internal/LinkedTreeMap;

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/gson/internal/LinkedTreeMap;->m:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    if-eq v0, v2, :cond_1

    .line 8
    .line 9
    iget v1, v1, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 10
    .line 11
    iget v2, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->j:I

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Lcom/google/gson/internal/LinkedTreeMap$Node;->k:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->h:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->k:Lcom/google/gson/internal/LinkedTreeMap;

    .line 4
    .line 5
    iget-object v1, v1, Lcom/google/gson/internal/LinkedTreeMap;->m:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->a()Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->k:Lcom/google/gson/internal/LinkedTreeMap;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lcom/google/gson/internal/LinkedTreeMap;->c(Lcom/google/gson/internal/LinkedTreeMap$Node;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->i:Lcom/google/gson/internal/LinkedTreeMap$Node;

    .line 13
    .line 14
    iget v0, v2, Lcom/google/gson/internal/LinkedTreeMap;->l:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/gson/internal/LinkedTreeMap$LinkedTreeMapIterator;->j:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw v0
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
