## This file contains all names of the networks to be started on system startup.
{% for netname, network in pillar.get('tinc', {}).items() %}
{{ netname }}
{% endfor %}
