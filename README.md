OPFIab
======

## The Road Ahead
- [ ] OPFIab Core
  - [ ] Solid Library API - **80%**
    - [ ] Public ```OPFIab``` methods.
    - [ ] Public ```IabHelper``` methods.
    - [ ] Public models.
    - [ ] Public listeners.
    - [ ] Configuration.
  - [ ] Solid internal architecture. - **80%**
    - [x] Event based internal communication.
    - [ ] Request handling.
    - [x] Response handling.
  - [ ] ```BillingProvider``` - **50%**
    - [ ] ```BillingController```
    - [ ] Abstract asyc based implementation.
    - [ ] Abstract aidl services (Google based) implementation.
    - [x] Sku resolver abstraction.
    - [ ] PurchaseVerifier abstraction.
      - [ ] Abstract public key based implementation.
      - [ ] Abstract server side check based implementation.
  - [ ] Store picking algorithm implementation. - **10%**
    - [ ] Package installer based.
    - [ ] Setup state handling.
    - [ ] BillingProved percistance.
  - [ ] Documentation - **0%**
    - [ ] Public API.
    - [ ] Internal impelentation comments.
    - [ ] Project Wiki. // TODO
  - [ ] QA - **30%**
    - [ ] Static Analyzers compliance
      - [ ] CheckStyle.
      - [ ] FindBug.
      - [ ] PMD.
      - [ ] Gradle plugin.
    - [ ] Test Coverage.
- [ ] BillingProvider implementations. - **10%**
  - [ ] Google InApp Billing
  - [ ] Amazon InApp
  - [ ] Samsung
    - [ ] Abstract activity-dependant BilingProvider implementation.
  - [ ] Fortumo
    - [ ] Subscriptions [#3](https://github.com/onepf/OPFIab/issues/3)
- [ ] Sample project - **10%**
  - [ ] Trivial Drive
  - [ ] Google migration sample.
- [ ] CI server. - **0%**
  - [ ] Automated builds.
  - [ ] GitHub integration.
